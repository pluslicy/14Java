package com.briup.ch16;

public class Student extends Person {
	//��̬����
	public static int number;	//ѧ������
	public String name;			//ѧ������
	//��ͨ����a,��ʹ��֮ǰ�����ʼ��
	public final int a ;		
	//��̬����
	public static final int b ;
	
	public Student(){
		number++;
		a = 3;//��ʼ������
	}
	
	//��̬�����
	static{
		System.out.println("---��̬�����---");
		number = 100;
		b = 3;	//��ʼ����̬����
	}


	//��̬����
	public static void test(){
		System.out.println("student static ");
	}

	public final int add(int a,int b){
		return a+b+1;
	}
}