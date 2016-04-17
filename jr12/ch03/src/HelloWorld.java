package com.briup.ch03;

import java.util.Date;
/**
 * 这是我们写的第一个HelloWorld类
 * 这个类打印出HelloWorld
 */
public class HelloWorld{
	/**
	 *这是一个方法
	 */
	public static void showHello(){
		System.out.println("static method");
	}
	public static void main(String[] args){
		// 单行注释
		System.out.println("hello world"+new Date());
		/*
			计算1+2
			1+2 = 3
		*/
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
}

