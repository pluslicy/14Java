package com.briup.ch15;

public class Animal {
	private String name;
	private int age;

	public void move(){
		System.out.println(this.name+"�����ƶ�������");
	}

	public Animal(){
		System.out.println("���ڵ���Animal�Ĺ��캯��");
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