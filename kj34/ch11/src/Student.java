package com.briup.ch10;

/**
  ѧ��������������ѧ������ģ�ѧ�������������洢��ѧ������Ϣ��
*/
public class Student{
	private long id;
	private String name;
	public int age;

	public Student(){
	
	}
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public void setName(String name){
		this.name = name;
	}
	public String toString1(){
		return "Student[id"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}