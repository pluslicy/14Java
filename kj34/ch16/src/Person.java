package com.briup.ch16;

public class Person {
	//�Ǿ�̬���� ��������
	public String name;//�˵�����
	//��̬����  ������
	public static long number;//����ĸ���
	
	//���캯��
	public Person(){
	
	}
	//��̬�����
	static{
		System.out.println("--��̬�����--");
	
	}
	//�Ǿ�̬���� ���󷽷�
	public void sayHello(){
		System.out.println(this.name+"˵��ã�");
	}
	//��̬����  �෽��
	public static void move(){
		System.out.println("ֱ������");
	}


}
