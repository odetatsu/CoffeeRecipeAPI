package com.coffeerecipe.api.resupons;

/**
 * レシピ情報レスポンス
 */
public class RecipeStepRes
{
	Integer orderRatio;
	Integer minutesDate;
	Integer secondDate;
	Integer temperature;
	Integer order;

	public Integer getOrderRatio() {
		return orderRatio;
	}
	public void setOrderRatio(Integer orderRatio) {
		this.orderRatio = orderRatio;
	}
	public Integer getMinutesDate() {
		return minutesDate;
	}
	public void setMinutesDate(Integer minutesDate) {
		this.minutesDate = minutesDate;
	}
	public Integer getSecondDate() {
		return secondDate;
	}
	public void setSecondDate(Integer secondDate) {
		this.secondDate = secondDate;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getOrder() {
		return order;
	}
	public void setOrder(Integer order) {
		this.order = order;
	}

	
}