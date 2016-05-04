package com.briup.ch16;

public class Person {
	//非静态属性 对象属性
	public String name;//人的名字
	//静态属性  类属性
	public static long number;//人类的个数
	
	//构造函数
	public Person(){
	
	}
	//静态代码块
	static{
		System.out.println("--静态代码块--");
	
	}
	//非静态方法 对象方法
	public void sayHello(){
		System.out.println(this.name+"说你好！");
	}
	//静态方法  类方法
	public static void move(){
		System.out.println("直立行走");
	}


}
