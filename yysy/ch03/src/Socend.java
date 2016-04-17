package com.briup.ch03;

/**
 *这是第二个java类，main方法调用showHello方法
 *@author: licy
 *@date:2016.3.8
 */
public class Socend {
	/**
	 * 这个方法是显示hello+名称
	 * @param String name
	 * @return void
	 */
	public static void showHello(String name){
		//单行注释
		System.out.println("hello "+name);
	}
	/**
	 * 这个是主方法
	 */
	public static void main(String[] args){
		/*
		   多行注释
		   不会出现在api中
		*/
		showHello("张三");
		char a = 64; // 10进制
		System.out.println(a);
		char a2 = '@';
		System.out.println(a2);
		char a3 = 0x40;  //16进制
		System.out.println(a3);
		char a4 = 0100;  //8进制
		System.out.println(a4);
		System.out.println("----------");
		// byte short int long
		int b = 110;
		System.out.println(b);
		long b2 = b;
		System.out.println(b2);
        short b3 = b;
		System.out.println(b3);
		byte b4 = b;
		System.out.println(b4);
	}
}