package com.briup.ch03;
/**
  学生类，保存学生信息
*/
public class Student {
	public String name;
	private double weight;
	/**
		构造函数,用来初始化对象
	*/
	public Student(){
		
	}
	/**
		说你好的方法
	*/
	public void sayHello(){
		System.out.println(name+" 说 hello");
	}
	/**
		加法运算
	*/
	public int add(int a, int b){
		return a+b;
	}
}