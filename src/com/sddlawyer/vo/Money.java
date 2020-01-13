package com.sddlawyer.vo;

public class Money {
	
	public String uuid;//uuid
	public String type;//支出还是收入
	public String date;//时间
	public double amount;//金额
	public String use;//用途
	public String name;//花钱的人
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getUse() {
		return use;
	}
	public void setUse(String use) {
		this.use = use;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUuid() {
		return uuid;
	}
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	
	

}
