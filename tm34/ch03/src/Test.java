package com.briup.ch03;

public class Test
{
	public static void main(String[] args){
		com.briup.ch03.Student zhangsan;
		//ʵ����  ���ഴ���������
		zhangsan = new Student();	
		zhangsan.name = "����";
		zhangsan.sayHello();
		/*
		   ��һ��
		   �ڶ���
		*/
		Student stu = new Student();
		stu.name = "����";
		stu.sayHello();
	}
}