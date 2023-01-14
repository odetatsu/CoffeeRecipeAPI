package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class GearInfoRes
{
    Integer key;
	String name;
	String info;
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
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
}