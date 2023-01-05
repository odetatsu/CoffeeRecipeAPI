package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class BeansInfoRes
{
    Integer beansKey;
	String beansName;
	String beansInfo;
	Integer roastVal;
	Integer dispOrder;
	public Integer getBeansKey() {
		return beansKey;
	}
	public void setBeansKey(Integer beansKey) {
		this.beansKey = beansKey;
	}
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
	public Integer getDispOrder() {
		return dispOrder;
	}
	public void setDispOrder(Integer dispOrder) {
		this.dispOrder = dispOrder;
	}
}