package com.zys.springDemo.bean;

public class User {
	private String name;
	private String sex;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public User(String name,String sex){
		super();
		this.name=name;
		this.sex=sex;
	}
}
