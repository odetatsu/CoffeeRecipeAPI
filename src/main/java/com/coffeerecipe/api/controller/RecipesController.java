package com.coffeerecipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.service.RecipesService;

@RestController
public class RecipesController 
{
		@Autowired
	RecipesService recipeService;

	@GetMapping("/recipes")
	public List<MRecipe> GetAllRecipes() {

	    List<MRecipe> recipes = recipeService.searchAll();
	    return  recipes;
	}
	
	@GetMapping("/recipes/{id}")
	public MRecipe GetRecipes(@PathVariable("id") Integer id) {

	    MRecipe recipe = recipeService.select(id);
	    return  recipe;
	}

}