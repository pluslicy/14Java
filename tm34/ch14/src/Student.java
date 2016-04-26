package com.briup.ch14;

/**
  学生类是用来创建学生对象的，学生对象是用来存储该学生的信息的
*/
public class Student{
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
	public Student(String name,int age){
		this.name = name;
		this.age = age;
	}
	
	public void setId(long id){
		//当前对象
		this.id = id;
		System.out.println("this:"+this);
	}
	public long getId(){
		return this.id;
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
