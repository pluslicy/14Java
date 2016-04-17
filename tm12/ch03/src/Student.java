package com.briup.ch03;
/**
 * 学生类，用来保存学生的信息
 */
public class Student{
	// 姓名
	public String name;
	// 体重
	private double weight;
	/**
	 * 学生类的构造函数，用于初始化一个对象
	 */
	public Student(){
	
	}
	/**
	 * 说你好的方法
	 */
	public void sayHello(){
		System.out.println(name+" 说 hello");
	}
	/**
	 * 计算整数之间加法运算的方法
	 * @param 加数 a
	 * @param 加数 b
	 * @return 和 
	 */
	public int add(int a,int b){
		return a+b;
	}
}