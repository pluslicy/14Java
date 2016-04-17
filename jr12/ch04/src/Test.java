package com.briup.ch04;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args){
		test5();	
	}
	//测试有符号小数
	public static void test5(){
		float f1 = 1.0;
		double a = 2.0;
		double b = 1.1d;
		System.out.println(a-b);
		System.out.println(subtract(a,b));
	}
	//封装！
	//银行中使用大数据来进行计算（BigDecimal）
	public static double subtract(double a,double b){
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.subtract(b2).doubleValue();
	}

	//测试有符号整数
	public static void test4(){
		byte a1 = 127;
		short a2 = 12345;
		int a3 = 12345678;
		long a4 = 1234567899876543L;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(1l-1);
	}
	//测试无符号整数
	public static void test3(){
		char c1 = 'A';  //只能用单引号引起单个字符
		char c2 = '中';
		//---------------
		char c3 = 65;	//10进制表示方法
		char c4 = 0x41;	//16进制  0x开头
		char c5 = 0101;	//8进制	  0开头
		char c6 = 0b1000001;	//2进制 jdk1.7之后 0b
		char c7 = '6';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
		System.out.println(c6);
		System.out.println(c7);
	}
	/**
	  99乘法表
	*/
	public static void test2(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}

	public static void test1(){
		//变量的声明，stu  为Student类型
		Student stu;
		//实例化
		stu = new Student();
		//方法stu对象中的name属性
		stu.id = 1001;
		stu.name = "terry";
		stu.age = 12;
		stu.showHello();

		Student stu2 = new Student();
		stu2.id = 1002;
		stu2.name = "larry";
		stu2.age =13;
		stu2.showHello();

		System.out.println("stu.name :"+stu.name);
		System.out.println("stu2.name :"+stu2.name);
	}
}