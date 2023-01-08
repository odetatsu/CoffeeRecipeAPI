package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class ModBeansInfoRes
{
	String beansName;
	String beansInfo;
	Integer roastVal;
 
	public String getBeansName() {
		return beansName;
	}
	public void setBeansName(String beansName) {
		this.beansName = beansName;
	}
	public String getBeansInfo() {
		return beansInfo;
	}
	public void setBeansInfo(String beansInfo) {
		this.beansInfo = beansInfo;
	}
	public Integer getRoastVal() {
		return roastVal;
	}
	public void setRoastVal(Integer roastVal) {
		this.roastVal = roastVal;
	}

}