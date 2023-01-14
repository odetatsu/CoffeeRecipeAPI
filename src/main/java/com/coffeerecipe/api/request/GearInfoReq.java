package com.coffeerecipe.api.request;

/**
 * 器具情報レスポンス
 */
public class GearInfoReq
{
	Integer key;
	String name;
	String info;
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
	public Integer getKey() {
		return key;
	}
	public void setKey(Integer key) {
		this.key = key;
	}

}