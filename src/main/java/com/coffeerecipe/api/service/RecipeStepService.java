package com.coffeerecipe.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.TRecipeStep;
import com.coffeerecipe.api.repository.RecipeStepRepository;
import com.coffeerecipe.api.request.StepInfosReq;

@Service
public class RecipeStepService {
    @Autowired
    RecipeStepRepository repository;
    public List<TRecipeStep> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    
    
    public List<TRecipeStep> select(int recipeKey) 
    {
       // ユーザーTBLの内容を全検索
        return repository.findByRecipeKey(recipeKey);
    }
    
    public void delete(int recipeKey) {
    	repository.deleteById(recipeKey);
    }
    
    public void save(List<StepInfosReq> stepInfos,int recipeKey)
    {
    	var itemList = new ArrayList<TRecipeStep>();
    	stepInfos.forEach((item)->{
        	var dto = new TRecipeStep();
        	dto.setRECIPE_KEY(recipeKey);
        	dto.setMINUTES_DATE(item.getMinutes());
        	dto.setSECOND_DATE(item.getSeconds());
        	dto.setDRIP_RATIO(item.getDripRatio());
        	dto.setTEMPERATURE(item.getTemperature());
        	dto.setSTEP(item.getStep());
        	dto.setCOMMENT(item.getComment());
        	itemList.add(dto);
    	});

    	repository.saveAllAndFlush(itemList);
    }
    
    public void update(List<StepInfosReq> stepInfos,int recipeKey)
    {
    	repository.deleteByRecipeKey(recipeKey);
    	
    	
    	var itemList = new ArrayList<TRecipeStep>();
    	stepInfos.forEach((item)->{
        	var dto = new TRecipeStep();
        	dto.setRECIPE_KEY(recipeKey);
        	dto.setMINUTES_DATE(item.getMinutes());
        	dto.setSECOND_DATE(item.getSeconds());
        	dto.setDRIP_RATIO(item.getDripRatio());
        	dto.setTEMPERATURE(item.getTemperature());
        	dto.setSTEP(item.getStep());
        	dto.setCOMMENT(item.getComment());
        	itemList.add(dto);
    	});

    	repository.saveAllAndFlush(itemList);
    }
}
