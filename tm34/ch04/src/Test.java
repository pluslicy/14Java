package com.briup.ch04;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args){
		test4();
	}
	//��������
	public static void test5(){
		boolean b1 = true;
		boolean b2 = false;
	}
	//������ BigDecimal
	public static double subtract(double a,double b){
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.subtract(b2).doubleValue();
	}
	//�����з���С��
	public static void test4(){
		float f1 = 102.2F;
		double f2 = 102.2;
		double a = 2.0;
		double b = 1.1;
		System.out.println(a-b);
		System.out.println(subtract(a,b));
	}
	//�����з�������
	public static void test3(){
		byte b1 = 127;
		short b2 = 12345;
		int b3 = 10002;
		long b4 = 100020000000L;
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(1l-1);
	}
	public static void test2(){
		char c1 = 65;   //10����
		char c2 = 0x41; //16���� 0x��ͷ
		char c3 = 0101; //8����	 0��ͷ
		char c4 = 0b1000001;//jdk1.7 2����0
		char c5 = 'A';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
	public static void test1(){
		//ʵ�����������Ǵ��������ģ��
		Student stu = new Student();
		stu.name = "terry";
		stu.sayHello();
		stu.show99();
	}
}