package com.briup.ch14;

public class Dog extends Animal{
	private String color;
	
	public Dog(){
		System.out.println("dog ���캯��");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

}