package com.coffeerecipe.api.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.repository.BeansRepository;
import com.coffeerecipe.api.repository.GearRepository;
import com.coffeerecipe.api.repository.RecipeRepository;
import com.coffeerecipe.api.repository.TasteRepository;
import com.coffeerecipe.api.request.RecipeInfoReq;

@Service
public class RecipesService {
    @Autowired
    RecipeRepository recipeRepository;
    @Autowired
    BeansRepository beansRepository;
    @Autowired
    TasteRepository tasteRepository;
    @Autowired
    GearRepository gearRepository;
    
    public List<MRecipe> searchAll() {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findAll();
    }
    
    
    public Optional<MRecipe> select(int recipeKey) {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findById(recipeKey);
    }
    
    public void delete(int recipeKey) {
    	var dto = recipeRepository.findById(recipeKey).get();
    	dto.setACTIVE_FLG(0);
    	dto.setDELETE_FLG(1);
    	Date date = new Date();
    	dto.setUPDATE_DATE(date);
    	recipeRepository.save(dto);      	
    }
    
    public int save(RecipeInfoReq req) {
    	
    	MRecipe mRecipe = new MRecipe();
    	mRecipe.setDRIP_RATIO(req.getDripRatio());
    	mRecipe.setACTIVE_FLG(1);
    	mRecipe.setDELETE_FLG(0);
    	mRecipe.setDISP_ORDER(recipeRepository.getMaxOrder()+1);
    	mRecipe.setRECIPE_NAME(req.getName());
    	mRecipe.setRECIPE_INFO(req.getInfo());
    	
    	var date = new Date();
    	mRecipe.setUPDATE_DATE(date);
    	mRecipe.setCREATE_DATE(date);

    	var mBeans = beansRepository.findById(req.getMaterialKey());
    	mRecipe.setMBeans(mBeans.get());
    	var mGear = gearRepository.findById(req.getGearKey());
    	mRecipe.setMGeart(mGear.get());
    	
    	var item = recipeRepository.saveAndFlush(mRecipe);
    	
    	var mTaste = new MTaste();
    	mTaste.setACIDITY(req.getAcidity());
    	mTaste.setBITTER(req.getBitter());
    	mTaste.setRICH(req.getRich());
        mTaste.setRECIPE_KEY(item.getRECIPE_KEY());    	
    	tasteRepository.saveAndFlush(mTaste);
    	
    	return item.getRECIPE_KEY();
    }
    
    
    public void update(RecipeInfoReq req, Integer recipeKey) {
    	
    	MRecipe mRecipe = recipeRepository.findById(recipeKey).get();
    	mRecipe.setDRIP_RATIO(req.getDripRatio());
    	mRecipe.setDISP_ORDER(recipeRepository.getMaxOrder()+1);
    	mRecipe.setRECIPE_NAME(req.getName());
    	mRecipe.setRECIPE_INFO(req.getInfo());
    	
    	var date = new Date();
    	mRecipe.setCREATE_DATE(date);

    	var mBeans = beansRepository.findById(req.getMaterialKey());
    	mRecipe.setMBeans(mBeans.get());
    	var mGear = gearRepository.findById(req.getGearKey());
    	mRecipe.setMGeart(mGear.get());
    	recipeRepository.saveAndFlush(mRecipe);
    	
    	var tastes = tasteRepository.findByRecipeKey(recipeKey);
    	var mTaste = tastes.get(0);
    	mTaste.setACIDITY(req.getAcidity());
    	mTaste.setBITTER(req.getBitter());
    	mTaste.setRICH(req.getRich());
    	tasteRepository.saveAndFlush(mTaste);
    	
        }
}