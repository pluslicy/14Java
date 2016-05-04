package com.briup.ch15;

public class Animal {
	private String name;
	private int age;
	
	public Animal(){
	
	}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("调用Animal的无参构造函数");
	}

	public void move(){
		System.out.println(this.name+"正在移动....");	
	}

	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	public String toString(){
		return "Animal[ name:"+this.name+",age:"+this.age+"]";
	}
}