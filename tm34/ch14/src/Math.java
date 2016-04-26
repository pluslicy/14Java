package com.briup.ch14;

public class Math {
	public int add(int a,int b){
		System.out.println("两个整数相加");
		return a+b;
	}
	public double add(int a,int b){
		System.out.println("两个整数相加");
		return a+b;
	}
	public String add(String a,int b){
		System.out.println("string int");
		return a+b;
	}
	public String add(int a,String b){
		System.out.println("int string");
		return a+b;
	}
	public double add(double a,double b){
		System.out.println("两个小数相加");
		return a+b;
	}
	public String add(String a,String b){
		System.out.println("两个字符相加");
		return a+b;
	}

}