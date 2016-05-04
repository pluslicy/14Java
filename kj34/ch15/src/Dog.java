package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		//隐式调用Animal的无参构造函数
		super(null,0);
		System.out.println("正在调用dog的构造函数");
	}
	public Dog(String name,int age,String color){
		super(name,age);
		this.color = color;
	}
	public void move(){
		System.out.println(super.getName()+"正在奔跑");
	}
	public void kanmen(){
		System.out.println(super.getName()+"正在看门");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return "[Dog name:"+super.getName()+",age:"+super.getAge()+",color:"+this.color+"]";
	}
}