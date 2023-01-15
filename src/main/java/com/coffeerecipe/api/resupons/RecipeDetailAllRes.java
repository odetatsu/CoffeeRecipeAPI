package com.coffeerecipe.api.resupons;

import java.util.List;

/**
 * レシピ情報レスポンス
 */
public class RecipeDetailAllRes
{
	RecipeDetailInfoRes recipeInfo;
	List<RecipeStepRes> recipeSteps;
	public RecipeDetailInfoRes getRecipeInfo() {
		return recipeInfo;
	}
	public void setRecipeInfo(RecipeDetailInfoRes recipeInfo) {
		this.recipeInfo = recipeInfo;
	}
	public List<RecipeStepRes> getRecipeSteps() {
		return recipeSteps;
	}
	public void setRecipeSteps(List<RecipeStepRes> recipeSteps) {
		this.recipeSteps = recipeSteps;
	}
}