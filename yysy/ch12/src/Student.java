package com.briup.ch12;
/**
	ѧ����
*/
public class Student {
	private long id;
	private String name;
	private int age;
	//���캯��
	public Student(){
	
	}
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//setter getter
	public void setId(long id){
		this.id = id;
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

	//��дtoString
	public String toString(){
		return "student[ id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}