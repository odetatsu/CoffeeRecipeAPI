package com.coffeerecipe.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.RRecipeBeans;
import com.coffeerecipe.api.repository.RecipeInfoRepository;

@Service
public class RecipeInfoService {
    @Autowired
    RecipeInfoRepository repository;
    public RRecipeBeans select(int recipeKey) {
        // ユーザーTBLの内容を全検索
        return repository.findById(recipeKey).get();
    }
    
    public void delete(int recipeKey) {
    	repository.deleteById(recipeKey);
    }
}