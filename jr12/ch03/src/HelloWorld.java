package com.briup.ch03;

import java.util.Date;
/**
 * ��������д�ĵ�һ��HelloWorld��
 * ������ӡ��HelloWorld
 */
public class HelloWorld{
	/**
	 *����һ������
	 */
	public static void showHello(){
		System.out.println("static method");
	}
	public static void main(String[] args){
		// ����ע��
		System.out.println("hello world"+new Date());
		/*
			����1+2
			1+2 = 3
		*/
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
}

