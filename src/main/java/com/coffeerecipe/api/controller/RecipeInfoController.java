package com.coffeerecipe.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.entity.RRecipeBeans;
import com.coffeerecipe.api.service.RecipeInfoService;

@RestController
public class RecipeInfoController 
{
	@Autowired
	RecipeInfoService service;

	
	@GetMapping("/recipeInfo")
	public RRecipeBeans GetRecipeInfo(@RequestParam(value = "recipeKey", defaultValue = "0", required = true)Integer recipeKey) {

	    RRecipeBeans recipeInfo = service.select(recipeKey);
	    return  recipeInfo;
	}
	
	
	@DeleteMapping("/recipeInfo")
	public void deleteRecipeInfo(@RequestParam(value = "recipeKey", defaultValue = "0", required = true)Integer recipeKey) {

		service.delete(recipeKey);
	    
	}
}