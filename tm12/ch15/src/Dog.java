package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		System.out.println("调用Dog的无参构造函数");	
	}
	public Dog(String name,int age,String color){
		this();
		super.setName(name);
		super.setAge(age);
		this.color = color;
		System.out.println("调用Dog的有参构造函数");
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return "Dog [name"+super.getName()+",age:"
				+super.getAge()+",color:"+this.color+"]";
	}
}	