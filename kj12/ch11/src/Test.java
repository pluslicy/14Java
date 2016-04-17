package com.briup.ch11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		new Test().test3();	
	}
	public void test3(){
		String a = "100";
		int b = 1;
		System.out.println(a+b);
	}
	public void test2(){
		String str = "XGCMCC#123321#123456";
		String[] arr = str.split("#");
		for(String s : arr){
			System.out.println(s);
		}

	}
	// 接收用户输入
	public void test1(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String i = sc.nextLine();
			System.out.println("接收到："+i);
		}
	}
}