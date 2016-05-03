package com.briup.ch16;

public class Student extends Person {
	//静态属性
	public static int number;	//学生数量
	public String name;			//学生姓名
	//普通常量a,在使用之前必须初始化
	public final int a ;		
	//静态常量
	public static final int b ;
	
	public Student(){
		number++;
		a = 3;//初始化常量
	}
	
	//静态代码块
	static{
		System.out.println("---静态代码块---");
		number = 100;
		b = 3;	//初始化静态常量
	}


	//静态方法
	public static void test(){
		System.out.println("student static ");
	}

	public final int add(int a,int b){
		return a+b+1;
	}
}