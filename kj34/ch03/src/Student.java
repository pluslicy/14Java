package com.briup.ch03;

/**
 * 这个类是学生类，用来保存学生的信息
 */
public class Student {
	public String name;
	private double weight;
	/**
	 * 这个是构造函数，用来初始化对象
	 */
	public Student(){
	
	}
	/**
	 * 这是说你好的方法
	 */
	public void sayHello(){
		System.out.println(name+" 说 hello");
	}
	/**
	 * 这是一个加法方法
	 */
	public int add(int a,int b){
		return a+b;
	}
	/**
	 * 内部类
	 */
	class Inner
	{
	}
}

/**
 *	这是一个老师类
 */
class Teacher {
	

}