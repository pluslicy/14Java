package com.briup.ch09;

public class Student {
	private long id;
	private String name;
	private int age;
	public Student(){
	
	}
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public String toString(){
		return "Student[id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}