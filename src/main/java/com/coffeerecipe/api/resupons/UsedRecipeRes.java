package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class UsedRecipeRes
{
	Integer key;
	String name;
	String date;
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	
}