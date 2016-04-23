package com.briup.ch14;

public class OverLoad {
	public double add(double a, int b){
		System.out.println("double int");
		return a+b;
	}
	public double add(int a, double b){
		System.out.println("int double");
		return a+b;
	}
	public double add(double a, double b){
		System.out.println("double double");
		return a+b;
	}
	public double add(double a, double b,double c){
		System.out.println("double double double");
		return a+b+c;
	}
}