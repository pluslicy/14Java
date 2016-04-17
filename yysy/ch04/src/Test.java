package com.briup.ch04;

import java.math.BigDecimal;

public class Test{
	public static void main(String[] args){
		test4();
	}
	//测试学生
	public static void test4(){
		//实例化对象
		// int a = 3;
		Student stu1 = new Student();
		//stu1.id = 1001;
		stu1.setId(1001);
		System.out.println(stu1.getId());
	}



	public static void test3(){
		long a = 11;
		float f1 = 9.1F;
		double d1 = 9.1D;
		System.out.println(1L+1);
	}
	//测试double的数学运算
	public static void test2(){
		double a = 2.0;
		double b = 1.1;
		System.out.println(a-b);
		System.out.println(substract(a,b));
	}
	public static double substract(double a,double b){
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.subtract(b2).doubleValue();
	}
	//测试char
	public static void test1(){
		char c1 = 'A';
		char c2 = 65;
		char c3 = 0x41;
		char c4 = '中';
		System.out.println(c4);
	}

}