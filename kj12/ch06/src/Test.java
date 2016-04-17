package com.briup.ch06;

public class Test {
	int a;
	char c;

	public static void main(String[] args){
		Test test = new Test();
		test.test8();
	}

	//测试短路
	public void test8(){
		System.out.println( aa() && bb() );
	}
	public boolean aa(){
		System.out.println("--a--");
		return false;
	}
	public boolean bb(){
		System.out.println("--b--");
		return true;
	}


	public void test7(){
		School sc1 = new School(1001,"江西理工","南昌","18812221111");
		School sc2 = new School(1001,"江西理工","南昌","18812221111");
		School sc3 = sc1;
		System.out.println(sc1 == sc3);

	}
	/**
	   操作符
	*/
	public void test6(){
		char a = 'A';
		double b = 65;
		boolean c = true;
		boolean d = false;
		boolean result = (a > b);
		System.out.println(result);
		/*
		double a = 15.0;
		int b = 7;
		System.out.println(a % b);
		*/
	}
	public void test5(){
		System.out.println(c);
		char c2 = '\u0000';
		System.out.println(c2);

	}
	public void test4(){
		int a = 3;
		if(true){
			int b = 4;
			System.out.println(a);
			System.out.println(b);
		}
	}
	public void test3(){
		System.out.println(a);
	}
	//实例方法，对象方法
	public void test2(){
		int b =1;//局部变量
		System.out.println(a);
		System.out.println(b);
	
	}

	public void test1(){
		/**
			1. 加载School类到内存中
			2. 参照School类（模板）在内存中开辟空间
			3. jvm完成属性的初始化
			4. 调用构造函数完成对象的初始化。
		*/
		School sc1 = new School(1001,"江西理工","南昌","18812221111");
		System.out.println(sc1);

		School sc2 = new School(1002,"华东交大","南昌","18812221111");
		System.out.println(sc2);
	}
}