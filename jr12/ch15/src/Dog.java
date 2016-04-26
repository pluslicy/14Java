package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		
	}
	public Dog(String name,int age,String color){
		super.setName(name);
		super.setAge(age);
		this.color = color;
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return "Dog[name:"+super.getName()+",age:"+super.getAge()+",color:"+this.color+"]";
	}
}