package com.briup.ch10;

/**
  ѧ��������������ѧ������ģ�ѧ�������������洢��ѧ������Ϣ��
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
