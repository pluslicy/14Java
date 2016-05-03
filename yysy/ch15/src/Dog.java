package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public String toString(){
		return "Dog [name:"+super.getName()+",age:"+this.getAge()+",color:"+this.color+"]";
	}

	public void move(){
		System.out.println(super.getName()+"ÕıÔÚ±¼ÅÜ...");
	}

	public void kanmen(){
		System.out.println("ÍôÍôÍô~~~");
	}
}