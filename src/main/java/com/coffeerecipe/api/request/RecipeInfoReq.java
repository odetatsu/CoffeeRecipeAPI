package com.coffeerecipe.api.request;

/**
 * レシピ情報レスポンス
 */
public class RecipeInfoReq
{
	Integer beansKey;
	String name;
	String info;
	Integer acidity;
	Integer bitter;
	Integer rich;
	Integer dripRatio;
	public Integer getBeansKey() {
		return beansKey;
	}
	public void setBeansKey(Integer beansKey) {
		this.beansKey = beansKey;
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
	public Integer getDripRatio() {
		return dripRatio;
	}
	public void setDripRatio(Integer dripRatio) {
		this.dripRatio = dripRatio;
	}
	
}