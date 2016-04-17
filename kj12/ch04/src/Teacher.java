package com.briup.ch04;

public class Teacher{
	private String name;
	private int age;
	private double salary;

	public Teacher(){
	
	}
	public Teacher(String name,int age,double salary){
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public String getName(){
		return this.name;
	}
}