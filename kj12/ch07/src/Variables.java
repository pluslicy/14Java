package com.briup.ch07;

public class Variables {
	public static int c;
	public char a;
	
	/**
	  main是怎么被调用的？
		jvm调用： Variables.main()
	 */
	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.test6();
		//System.out.println("|"+vrs.a+"|");
		//System.out.println("|"+c+"|");
	}
	public void test6(){
		int a = 4;
		int b = 1;
		System.out.println(a^b);
	}
	public int max(int a,int b){
		return a>b?a:b;
	}
	public void test5(){
		School sc1 = new School(1002L,"华东交大","江西南昌");
		School sc2 = new School(1002L,"华东交大","江西南昌");
		School sc3 = sc1;
		System.out.println(sc1 == sc3);
	}
	public void test4(){
		int result = add(1,del(5,2));
		System.out.println(result);
	}
	public int add(int a,int b){
		System.out.println("---add----");
		return a+b;
	}
	public int del(int a,int b){
		System.out.println("---del----");
		return a-b;
	}
	public void test3(){
		//float a = 3.0F;
		int a =3;
		int b = 2;
		int result = a%b;
		System.out.println(result);
	}
	public void test2(){
		double a = 3.1D;
		char b = 'A';//65
		double result = a+b;
		System.out.println(result);
	}
	public void test1(){
		System.out.println("hello world");
	}
}