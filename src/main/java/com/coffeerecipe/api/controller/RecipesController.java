package com.coffeerecipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

	    List<MRecipe> userlist = recipeService.searchAll();
	    return  userlist;
	}

}