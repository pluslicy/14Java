package com.briup.ch03;
/**
  ѧ���࣬����ѧ����Ϣ
*/
public class Student {
	public String name;
	private double weight;
	/**
		���캯��,������ʼ������
	*/
	public Student(){
		
	}
	/**
		˵��õķ���
	*/
	public void sayHello(){
		System.out.println(name+" ˵ hello");
	}
	/**
		�ӷ�����
	*/
	public int add(int a, int b){
		return a+b;
	}
}