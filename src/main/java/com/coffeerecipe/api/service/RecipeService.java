package com.coffeerecipe.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.Recipe;
import com.coffeerecipe.api.repository.RecipeRepository;

@Service
public class RecipeService {
    @Autowired
    RecipeRepository recipeRepository;
    public List<Recipe> searchAll() {
        // ユーザーTBLの内容を全検索
        return recipeRepository.findAll();
    }
}