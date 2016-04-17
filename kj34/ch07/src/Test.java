package com.briup.ch07;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test6();
	}
	//位运算
	public void test6(){
		byte a = 1;
		byte b = 2;
		int result = a|b;
		System.out.println(result);
	}
	//三目
	public void test5(){
		System.out.println(max(44,90));
	}
	public int max(int a,int b){
		return a>b?a:b;
	}

	//逻辑运算符
	public void test4(){
		boolean result =  aa() || cc();
		System.out.println(result);
	}
	public boolean aa(){
		System.out.println("--aa--");
		return true;
	}
	public boolean cc(){
		System.out.println("--cc--");
		return false;
	}
	//比较
	public void test3(){
		//byte a = 3;
		//float b = 3.0f;
		boolean a = true;
		boolean b = false;
		boolean result = a ==  b;
		System.out.println(result);

	}
	//测试赋值运算符
	public void test2(){
		//int result = add(1,del(9,3));
		int result = 3;
		result <<= 3;// result = result <<3;
		System.out.println(result);
	}
	public int add(int a,int b){
		System.out.println("---add---");
		return a+b;
	}
	public int del(int a,int b){
		System.out.println("---del---");
		return a-b;
	}
	//测试算数运算符
	// 51  -  '3'
	// 52  -  '4'
	public void test1(){
		short a = 9;
		short b = 3;
		//byte a = 3;
		//float b = 2.1F;
		int result = a+b;
		System.out.println(result);
	}
}
