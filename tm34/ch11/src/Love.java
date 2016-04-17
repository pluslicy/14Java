package com.briup.ch11;

import java.util.Scanner;

public class Love {
	public static void main(String[] args){
		//  张三 李四  35 集合  map
		System.out.println("*****爱情魔法测试*****");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("请输入【男生姓名#女生姓名】测试你们的爱情指数");
			String names = sc.nextLine();
			String[] arr = names.split("#");
			int num = (int)(Math.random()*100);
			System.out.println(arr[0]+"和"+arr[1]+"的爱情指数为："+num);
		}
	}
}