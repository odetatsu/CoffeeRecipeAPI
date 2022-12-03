package com.coffeerecipe.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.entity.Recipe;
import com.coffeerecipe.api.service.RecipeService;

@RestController
public class RecipesController 
{
		@Autowired
	RecipeService recipeService;

	@GetMapping("/recipes")
	public List<Recipe> greeting(@RequestParam(value = "name", defaultValue = "World") String name) {

	    List<Recipe> userlist = recipeService.searchAll();
	    return  userlist;
	}
}