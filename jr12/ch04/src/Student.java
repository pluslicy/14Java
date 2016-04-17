package com.briup.ch04;
/**
  学生类，用来保存学生的信息，以及学生的行为
*/
public class Student {
	public long id;
    public String name;
	public int age;
	private double weight;

	/**
		构造函数，初始化对象
	*/
	public Student(){
	
	}

	/**
	实例方法，说你好的方法
	*/
	public void showHello(){
		System.out.println("hello ");
	}

	/**
	实例方法，加法运算
	*/
	public int add(int a,int b){
		return a+b;
	}
}