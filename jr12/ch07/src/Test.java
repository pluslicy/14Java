package com.briup.ch07;

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test6();
	}
	public void test6(){
		System.out.println(max(5,10));
	}
	// && &区别  || |区别
	public int max(int a,int b){
		return a>b?a:b;
	}
	public void test5(){
		int a = 3;
		int b = (++a)+(a++)+(++a);
		System.out.println(b);
	}
	public void test4(){
		int a = 3;
		int b = 1;
		b -= a; //=> b = b+a;
		System.out.println(b);
	}

	public void test3(){
		//byte a = 4;
		//float b = 4.0F;
		//boolean a = true;
		//boolean b = true;
		Telephone t1 = new Telephone(1001L,"iphone6","apple");
		Telephone t2 = new Telephone(1001L,"iphone6","apple");
		Telephone t3 = t1;
		boolean result = t1 == t3;
		System.out.println(result);
	}

	public void test2(){
		int c = add(1,del(4,1));
		System.out.println(c);
	}
	public int add(int a ,int b){
		System.out.println(" --add--");
		return a+b;
	}
	public int del(int a,int b){
		System.out.println(" --del--");
		return a-b;
	}
	//算数运算符
	public void test1(){
		//int a = 3;
		//Telephone tel = new Telephone();
		//int b = 4;
		//byte b = 7;
		//short b = 7;
		//long b = 7L;
		//char b = 'A';
		//float b =4.1F;
		//String b = "3";
		//String result =a+tel.toString();
		int a = 15;
		char b = 2;
		int result = a%b;
		System.out.println("result:"+result);
	}
}