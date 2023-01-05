package com.coffeerecipe.api.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.repository.RecipeRepository;

@Service
public class RecipesService {
    @Autowired
    RecipeRepository recipeRepository;
    public List<MRecipe> searchAll() {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findAll();
    }
    
    
    public Optional<MRecipe> select(int recipeKey) {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findById(recipeKey);
    }
    
    public void delete(int recipeKey) {
    	recipeRepository.deleteById(recipeKey);
    }
}