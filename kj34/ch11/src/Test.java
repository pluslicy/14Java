package com.briup.ch11;

import java.util.Scanner;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test3(){
		int[] arr = new int[]{6,2,1};
		int[] des = new int[10];
		System.arraycopy(arr,0,des,0,arr.length-1);
		showArray(arr);
		showArray(des);
	}
	public void showArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	public void test2(){
		String str = "hello";
		String str2 = str.toUpperCase();
		System.out.println(str2);
		String name = "张三";
		String firstName =  name.substring(0,1);
		System.out.println("firstName:"+firstName);
		System.out.println(firstName+"世民");
		String a = "1001#terry#12";
		String[] arr = a.split("#");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println("briup".equals("briup"));
	}
	//扫描屏幕获取输入
	public void test1(){
		//创建扫描器对象，监控标准输入
		Scanner sc = new Scanner(System.in);
		//从标准输入中获取整数类型  数字[回车]
		while(true){
			System.out.println("请输入：");
			String i = sc.nextLine();
			System.out.println("接收到了:"+i);
		}
	
	}
}