package com.briup.ch14;

/**
  学生类是用来创建学生对象的，
  学生对象是用来存储该学生的信息的
*/
public class Teacher{
	private long id;
	private String name;
	private int age;
	private double salary;

	public Teacher(){
		this("无名氏",20);
	}

	public Teacher(double salary){
		System.out.println("有参 salary");
		this.salary = salary;
	}

	public Teacher(String name ,int age){
		this(4500);
		this.name = name;
		this.age = age;
		System.out.println("有参 name age");
	}

	public void setId(long id){
		this.id = id;
		System.out.println(this);
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
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public String toString(){
		return "Student[id:"+this.id+",name:"+this.name+",age:"+this.age+",salary:"+this.salary+"]";
	}
}