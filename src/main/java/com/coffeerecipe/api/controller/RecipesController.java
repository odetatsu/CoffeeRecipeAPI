package com.coffeerecipe.api.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coffeerecipe.api.converter.ResuponsConverter;
import com.coffeerecipe.api.entity.MRecipe;
import com.coffeerecipe.api.entity.MTaste;
import com.coffeerecipe.api.entity.TRecipeStep;
import com.coffeerecipe.api.request.PostRecipeReq;
import com.coffeerecipe.api.resupons.RecipeDetailInfoRes;
import com.coffeerecipe.api.resupons.RecipeInfoRes;
import com.coffeerecipe.api.resupons.RecipeStepRes;
import com.coffeerecipe.api.service.RecipeStepService;
import com.coffeerecipe.api.service.RecipesService;
import com.coffeerecipe.api.service.TasteService;

@RestController
public class RecipesController 
{
	@Autowired
	RecipesService recipeService;
	
	@Autowired
	TasteService tasteService;
	
	@Autowired
	RecipeStepService recipeStepService;
	
	@GetMapping("/recipes")
	public List<RecipeInfoRes> GetAllRecipes() {

	    List<MRecipe> recipes = recipeService.searchAll();
	    List<RecipeInfoRes> res = new ArrayList<RecipeInfoRes>() ;

	    recipes.stream().filter(str -> str.getACTIVE_FLG()==1).forEach(s->res.add(ResuponsConverter.Convert(s)));
	    return  res;
	}
	
	@GetMapping("/recipes/{id}")
	public RecipeDetailInfoRes GetRecipes(@PathVariable("id") Integer id) {

		Optional<MRecipe>  recipe = recipeService.select(id);
	    List<MTaste> taste = tasteService.select(id); 
	    if(taste.size()==0) 
	    {
	    	return  ResuponsConverter.Convert(recipe.get(),null);
	    }
	    return  ResuponsConverter.Convert(recipe.get(),taste.get(0));
	    
	}
	
	@GetMapping("/recipestep/{id}")
	public List<RecipeStepRes> GetRecipeDetail(@PathVariable("id") Integer id) {

		List<TRecipeStep> recipeSteps = recipeStepService.select(id);
	    return  ResuponsConverter.Convert(recipeSteps);
	    
	}
	
	@DeleteMapping("/recipes/{id}")
	public void DeleteRecipes(@PathVariable("id") Integer id) {

		recipeService.delete(id);
	    
	}
	
	
	@PostMapping("/recipestep")
	public void PostRecipeSteps(@RequestBody PostRecipeReq req) {

		var recipeKey = recipeService.save(req.getRecipeInfo());
		recipeStepService.save(req.getStepInfos(),recipeKey);
	}
	
	@PutMapping("/recipestep")
	public void PutRecipeSteps(@RequestBody PostRecipeReq req) {

		recipeService.update(req.getRecipeInfo(),req.getRecipeKey());
		recipeStepService.update(req.getStepInfos(),req.getRecipeKey());
	}
}