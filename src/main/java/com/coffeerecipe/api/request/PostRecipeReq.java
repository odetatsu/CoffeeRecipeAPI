package com.coffeerecipe.api.request;

import java.util.List;

/**
 * レシピ情報レスポンス
 */
public class PostRecipeReq
{
	Integer recipeKey;
	RecipeInfoReq recipeInfo;
	List<StepInfosReq> stepInfos;
	public RecipeInfoReq getRecipeInfo() {
		return recipeInfo;
	}
	public void setRecipeInfo(RecipeInfoReq recipeInfo) {
		this.recipeInfo = recipeInfo;
	}
	public List<StepInfosReq> getStepInfos() {
		return stepInfos;
	}
	public void setStepInfos(List<StepInfosReq> stepInfos) {
		this.stepInfos = stepInfos;
	}
	public Integer getRecipeKey() {
		return recipeKey;
	}
	public void setRecipeKey(Integer recipeKey) {
		this.recipeKey = recipeKey;
	}


}