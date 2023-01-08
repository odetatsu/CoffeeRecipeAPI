package com.coffeerecipe.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coffeerecipe.api.entity.TRecipeOrder;
import com.coffeerecipe.api.repository.RecipeOrderRepository;

@Service
public class RecipeOrderService {
    @Autowired
    RecipeOrderRepository repository;
    public List<TRecipeOrder> searchAll() {
        // ユーザーTBLの内容を全検索
        return repository.findAll();
    }
    
    
    public List<TRecipeOrder> select(int recipeKey) 
    {
       // ユーザーTBLの内容を全検索
        return repository.findByRecipeKey(recipeKey);
    }
    
    public void delete(int recipeKey) {
    	repository.deleteById(recipeKey);
    }
}
