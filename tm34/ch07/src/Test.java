package com.briup.ch07;

public class Test {
	public Test(){
		System.out.println("--Test构造函数--");  
	}
	public static void main(String[] args){
		System.out.println("--main--");
		Test test = new Test();
		test.test7();
	}
	public void test7(){
		System.out.println(3&1);
	}
	public void test6(){
		System.out.println("max:"+max(101,21,300));
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
	public void test5(){
		boolean result =  aa() && bb();
		System.out.println("result:"+result);
	}
	public boolean aa(){
		System.out.println("--aa--");
		return true;
	}
	public boolean bb(){
		System.out.println("--bb--");
		return false;
	}
	//测试比较运算符
	public void test4(){
		//int a = 5;
		//float b = 5.0F;
		//boolean a = true;
		//boolean b = true;
		Test a = new Test();
		Test b = new Test();
		Test c = a;
		Test d = null;
		if(d!=null){
			d.test3();
		}else{
			System.out.println("d is null");
		}
		boolean result = a==c;
		System.out.println("result:"+result);
	}
	//测试自增自减
	public void test3(){
		int a = 3;
		int result = (++a)+(a++)+(a++);
		System.out.println("result:"+result+",a:"+a);
		//  a = 6
		//  4+4+5

	}
	public void test2(){
		System.out.println("--test2--");
		boolean result = aa();
		System.out.println("result:"+result);
	}
	
	/**
		测试算数运算符
	 */
	public void test1(){
		int a = 5;
		//int b = 4;
		//char b = 'A';
		//char b = '1';
		//float b = 4.9F;
		int b = 2;
		int result = a%b;
		System.out.println("result:"+result);
	}
}