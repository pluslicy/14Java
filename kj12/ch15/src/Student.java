package com.briup.ch15;

public class Student{
	private String name;
	protected int age;

	public void setName(String name){
		this.name = name;//name对于本类中的方法可见
	}
	public String getName(){
		return this.name;
	}
}