package com.coffeerecipe.api.request;

/**
 * レシピ情報レスポンス
 */
public class RecipeInfoReq
{
	Integer materialKey;
	Integer gearKey;
	String name;
	String info;
	Integer acidity;
	Integer bitter;
	Integer rich;
	Integer dripRatio;

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
	public Integer getGearKey() {
		return gearKey;
	}
	public void setGearKey(Integer gearKey) {
		this.gearKey = gearKey;
	}
	public Integer getMaterialKey() {
		return materialKey;
	}
	public void setMaterialKey(Integer materialKey) {
		this.materialKey = materialKey;
	}
	
}