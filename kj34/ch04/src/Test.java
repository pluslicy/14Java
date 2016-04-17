package com.briup.ch04;

import java.math.BigDecimal;

public class Test{
	public static void main(String[] args){
		//对象的实例化
		Test test = new Test();
		test.test2();
	}
	//测试小数
	public void test3(){
		double a = 2.0;
		double b = 1.1;
		System.out.println(a-b);
		System.out.println(subtract(a,b));
	}
	public double subtract(double a,double b){
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.subtract(b2).doubleValue();
	}
	//测试有符号整数
	public void test2(){
		byte b1 = 127;
		
		long b2 = 12345678901L;
		long b3 = 12345;
		double d1 = 10.0d;
		float d2 = 10.0f;
	}
	//测试char
	public void test1(){
		char c1 = 'A';
		char c2 = 66;
		char c3 = 0x43;
		char c4 = 0104;//69  64+4+1
		char c5 = 0b1000101;
		//char c6 = -1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}