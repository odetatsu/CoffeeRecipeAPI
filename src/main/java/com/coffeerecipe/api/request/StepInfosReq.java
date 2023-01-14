package com.coffeerecipe.api.request;

/**
 * レシピ情報レスポンス
 */
public class StepInfosReq
{
	//{comment: "", dripRatio: 0, temperature: 0, minutes: 0, seconds: 0, step: 1}
	String comment;
	Integer temperature;
	Integer minutes;
	Integer seconds;
	Integer step;
	Integer dripRatio;
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public Integer getTemperature() {
		return temperature;
	}
	public void setTemperature(Integer temperature) {
		this.temperature = temperature;
	}
	public Integer getMinutes() {
		return minutes;
	}
	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}
	public Integer getSeconds() {
		return seconds;
	}
	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}
	public Integer getStep() {
		return step;
	}
	public void setStep(Integer step) {
		this.step = step;
	}
	public Integer getDripRatio() {
		return dripRatio;
	}
	public void setDripRatio(Integer dripRatio) {
		this.dripRatio = dripRatio;
	}


}