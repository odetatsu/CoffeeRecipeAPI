package com.coffeerecipe.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.converter.ResuponsConverter;
import com.coffeerecipe.api.request.AddUsedRecipeReq;
import com.coffeerecipe.api.resupons.UsedRecipeRes;
import com.coffeerecipe.api.service.RecipesService;
import com.coffeerecipe.api.service.UsedRecipeService;

@RestController
public class UsedRecipeController 
{
    @Autowired
    UsedRecipeService service;
    
	@Autowired
	RecipesService recipeService;
	
	@GetMapping("/brewes")
	public List<UsedRecipeRes> GetAllBrewes() {

	    var recipes = service.all();
	    var res = new ArrayList<UsedRecipeRes>() ;

	    var allRecipe =  recipeService.searchAll();
	    recipes.forEach(s->res.add(ResuponsConverter.Convert(s,allRecipe)));
	    
	    return  res;
	}
   
	
	@PostMapping("/brewes")
	public void PostBrew(@RequestBody AddUsedRecipeReq req) {

	    service.save(req.getRecipeKey());

	}
}