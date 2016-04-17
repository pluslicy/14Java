package com.briup.ch06;

/**
	Test测试类
 */
public class Variables {
	private int age;//属性，变量
	double salary;


	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.test1(); 
		vrs.test2();
		vrs.test3();
	}
	public void test3(){
		int a = 0;
		for(int i=1;i<=10;i++){
			a+=i;
		}
		System.out.println("total:"+a);
	}
	//测试实例变量
	public void test1(){
		int a = 3;
		System.out.println("test1 a:"+a);
		System.out.println("test1 age:"+age);
		{
			int b = 4;
			System.out.println("test1 {} a:"+a);
			System.out.println("test1 {} b:"+b);
		}
		//System.out.println("test1 b:"+b);

	}
	//测试实例变量
	public void test2(){
		//System.out.println("test2 a:"+a);
		System.out.println("test2 age:"+age);
	}
	
}