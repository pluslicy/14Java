package com.briup.ch14;

public class Animal {
	private String name;
	private int age;
	//public Animal(){}
	public Animal(String name,int age){
		this.name = name;
		this.age = age;
		System.out.println("Animal �вι��캯��");
	}
	public void move(){
		System.out.println(this.name+"�����ƶ�...");
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
	//��д
	public String toString(){
		return "Animal[ name:"+this.name+",age:"+this.age+" ]";
	} 
}