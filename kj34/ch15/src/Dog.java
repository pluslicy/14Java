package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		//隐式调用Animal的无参构造函数
		System.out.println("正在调用dog的构造函数");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}