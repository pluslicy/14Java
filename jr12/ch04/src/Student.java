package com.briup.ch04;
/**
  ѧ���࣬��������ѧ������Ϣ���Լ�ѧ������Ϊ
*/
public class Student {
	public long id;
    public String name;
	public int age;
	private double weight;

	/**
		���캯������ʼ������
	*/
	public Student(){
	
	}

	/**
	ʵ��������˵��õķ���
	*/
	public void showHello(){
		System.out.println("hello ");
	}

	/**
	ʵ���������ӷ�����
	*/
	public int add(int a,int b){
		return a+b;
	}
}