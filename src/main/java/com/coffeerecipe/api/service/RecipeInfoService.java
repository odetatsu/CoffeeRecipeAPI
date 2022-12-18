package com.coffeerecipe.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.repository.RecipeRepository;

@Service
public class RecipeInfoService {
    @Autowired
    RecipeRepository recipeRepository;
    public MRecipe select(int recipeKey) {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findById(recipeKey).get();
    }
    
    public void delete(int recipeKey) {
    	recipeRepository.deleteById(recipeKey);
    }
}