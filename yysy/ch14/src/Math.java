package com.briup.ch14;

public class Math{
	public int add(int a,int b){
		System.out.println("add int + int");
		return a+b;
	}
	public double add(double a,int b){
		System.out.println("add double + int");
		return a+b;
	}
	public double add(int a,double b){
		System.out.println("add int + double");
		return a+b;
	}
}