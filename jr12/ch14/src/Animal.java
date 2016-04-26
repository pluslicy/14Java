package com.briup.ch14;

public class Animal{
	private String name;
	private int age;
	public Animal(){
		System.out.println("Animal 无参构造函数");
	}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Animal 有参构造函数");
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
}