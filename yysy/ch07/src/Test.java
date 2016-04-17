package com.briup.ch07;

import java.io.*;

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test9();
	}
	public void test9(){
		int a = 3;
		int b = (++a)+(++a)+(a++);
		// 4 + 5 + 5	
		System.out.println("a:"+a+",b"+b);
	}
	public void test8(){
		int max = max(192,3,99);
		System.out.println("max:"+max);
		int a = 13;
		int b = 5;
		double result = a>b?9:9.9;
		System.out.println("result:"+result);
	}
	public int max(int a,int b,int c){
		return a>b?(a>c?a:c):(b>c?b:c);
		/*
		if(a>b){
			if(a>c){
				return a;
			}else{
				return c;
			}
		}else{
			if(b>c){
				return b;
			}else{
				return c;
			}
		}*/
	}
	public void test7(){
		File file = new File("C:/a.txt");
		if(!file.exists()){
			try{
				file.createNewFile();
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
	}
	public void test6(){
		boolean result = compareMin(4,12) && compareMax(2,3);
		System.out.println("result:"+result);
	}
	public boolean compareMin(int a,int b){
		System.out.println("---min----");
		return a<b;
	}
	// compareMax 比较大的， a大 返回true, b大返回false
	public boolean compareMax(int a,int b){
		System.out.println("---max----");
		return a>b;
	}

	public void test5(){
		//int a = 65;
		//char b = 'A';
		Test a = new Test();
		Test b = new Test();
		Test c = a;
		boolean result = a == c;
		System.out.println("result:"+result);
	}
	public void test4(){
		boolean result = compareMax(4,1);
		System.out.println("result:"+result);
	}
	
	public void test3(){
		int a = 11;
		int b = 2;
		int result = a%b;
		System.out.println("result:"+result);
	}
	//测试算数运算符
	public void test2(){
		long a = 3;
		//char b = '3';	//51
		float b = 2.0F;
		float result = a+b;
		System.out.println("result:"+result);
	}

	// 回顾静态与非静态的使用
	public void test1(){
		System.out.println("static b: "+Review.b);
		Review.mb();

		Review review = new Review();
		System.out.println("no static a: "+review.a);
		review.ma();
	}
}