package com.briup.ch04;

// JUnit
public class Test {
	public static void main(String[] args){
		test3();
	}
	//测试有符号小数
	public static void test3(){
		float d1 = 2.0F;
		float d2 = 1.1f;
		long a = 10;
		double d= 10.0D;
		Long c = 10L;	//Long包装器值后必须加L
		System.out.println(a);
		//System.out.println(d1-d2);
	}
	//测试有符号整数
	public static void test2(){
		byte b = 127;
		System.out.println(b);
	}
	//测试char
	public static void test1(){
		char c1 = 65;
		char c2 = 'A';
		char c3 = 0x41;  //3*16^1+1*16^0
		char c4 = 0101;
		char c5 = 0b1000001;// jdk7
		//char c6 = -1;
		System.out.println(c5);
	}
}
