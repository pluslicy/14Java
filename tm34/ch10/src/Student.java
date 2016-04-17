package com.briup.ch10;

/**
  学生类是用来创建学生对象的，学生对象是用来存储该学生的信息的
*/
public class Student{
	public long id;
	public String name;
	public int age;

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
