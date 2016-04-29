package com.briup.ch14;

public class Dog extends Animal {
	private String color;

	public Dog(){
		super(null,0);
		System.out.println("dog constructor");
	}
	public Dog(String name,int age,String color){
		this();
		super.setName(name);
		super.setAge(age);
		this.color = color;
	}
	
	public void move(){
		System.out.println(super.getName()+"正在奔跑！");
	}

	public void sleep(){
		System.out.println(super.getName()+"正在休息！");
	}


	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public String toString(){
		return "Dog [name:"+super.getName()+",age:"+super.getAge()+",color:"+this.color+"]";
	}
}