package com.briup.ch15;

public class Animal {
	private String name;
	private int age;
	public Animal(String name,int age){
		
	}
	public Animal(){
	
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
		return "Animal [name:"+this.name+",age:"+this.age+"]";
	}

	public void move(){
		System.out.println(this.name+"ÕýÔÚÒÆ¶¯...");
	}
	
}