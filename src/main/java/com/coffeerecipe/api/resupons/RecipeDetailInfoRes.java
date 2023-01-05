package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class RecipeDetailInfoRes
{
    Integer recipeKey;
	String recipeName;
	String recipeInfo;
	String beansName;
	Integer roastVal;
	Integer dispOrder;
	Integer acidity;
	Integer bitter;
	Integer rich;
	String remarks;

	
	public Integer getRecipeKey() {
		return recipeKey;
	}
	public void setRecipeKey(Integer recipeKey) {
		this.recipeKey = recipeKey;
	}
	public String getRecipeName() {
		return recipeName;
	}
	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}
	public String getRecipeInfo() {
		return recipeInfo;
	}
	public void setRecipeInfo(String recipeInfo) {
		this.recipeInfo = recipeInfo;
	}
	public String getBeansName() {
		return beansName;
	}
	public void setBeansName(String beansName) {
		this.beansName = beansName;
	}
	public Integer getRoastVal() {
		return roastVal;
	}
	public void setRoastVal(Integer roastVal) {
		this.roastVal = roastVal;
	}
	public Integer getDispOrder() {
		return dispOrder;
	}
	public void setDispOrder(Integer dispOrder) {
		this.dispOrder = dispOrder;
	}
	public Integer getAcidity() {
		return acidity;
	}
	public void setAcidity(Integer acidity) {
		this.acidity = acidity;
	}
	public Integer getBitter() {
		return bitter;
	}
	public void setBitter(Integer bitter) {
		this.bitter = bitter;
	}
	public Integer getRich() {
		return rich;
	}
	public void setRich(Integer rich) {
		this.rich = rich;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}