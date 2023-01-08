package com.coffeerecipe.api.request;

/**
 * レシピ情報レスポンス
 */
public class ModBeansInfoReq
{
	Integer beansKey;
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
	public Integer getBeansKey() {
		return beansKey;
	}
	public void setBeansKey(Integer beansKey) {
		this.beansKey = beansKey;
	}

}