package com.briup.ch04;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args){
		test5();	
	}
	//�����з���С��
	public static void test5(){
		float f1 = 1.0;
		double a = 2.0;
		double b = 1.1d;
		System.out.println(a-b);
		System.out.println(subtract(a,b));
	}
	//��װ��
	//������ʹ�ô����������м��㣨BigDecimal��
	public static double subtract(double a,double b){
		BigDecimal b1 = new BigDecimal(Double.toString(a));
		BigDecimal b2 = new BigDecimal(Double.toString(b));
		return b1.subtract(b2).doubleValue();
	}

	//�����з�������
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
	//�����޷�������
	public static void test3(){
		char c1 = 'A';  //ֻ���õ��������𵥸��ַ�
		char c2 = '��';
		//---------------
		char c3 = 65;	//10���Ʊ�ʾ����
		char c4 = 0x41;	//16����  0x��ͷ
		char c5 = 0101;	//8����	  0��ͷ
		char c6 = 0b1000001;	//2���� jdk1.7֮�� 0b
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
	  99�˷���
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
		//������������stu  ΪStudent����
		Student stu;
		//ʵ����
		stu = new Student();
		//����stu�����е�name����
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