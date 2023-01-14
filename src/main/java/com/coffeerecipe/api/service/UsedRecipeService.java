package com.coffeerecipe.api.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.TUsedRecipe;
import com.coffeerecipe.api.repository.UsedRecipeRepository;

@Service
public class UsedRecipeService {
	
    @Autowired
    UsedRecipeRepository repository;
    
    public List<TUsedRecipe> all() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    
    public void save(Integer recipeKey) {
    	
    	var dto = new TUsedRecipe();
    	dto.setRECIPE_KEY(recipeKey);
    	
    	var date = new Date();
    	dto.setUSED_DATE(date);
    	repository.save(dto);
    }
    
}
