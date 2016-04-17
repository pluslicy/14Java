package com.briup.ch11;

import java.util.Scanner;
import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test3(){
		String[] firstNames = {"李","张","王","郭"};
		System.out.println(Arrays.binarySearch(firstNames,"张"));
	}

	public void test2(){
		String str1 = "hello";
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);	//比较的是内存地址
		System.out.println(str1.equalsIgnoreCase(str2));	//比较的字符序列

		String str = "1001#terry#12";
		String[] arr = str.split("#");// {"1001","terry","12"}
		for(String s : arr){
			System.out.println(s);
		}
	}


	/**
		测试Scanner，从标准输入中获取用户输入。
	*/
	public void test1(){
		Scanner sc = new Scanner(System.in);

		while(true){
			String i = sc.nextLine();
			System.out.println("接收到："+i);
		}
		
	}
}