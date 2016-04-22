package com.briup.ch11;
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	//数组拷贝
	public void test3(){
		int[] arr = new int[]{9,3,3,4};
		int[] arr2 = new int[8];
		//数组拷贝
		System.arraycopy(arr,2,arr2,3,arr.length-2);
		//打印数组
		showArray(arr);
		showArray(arr2);
	}	
	//封装了打印数组的方法
	public void showArray(int[] arr){
		for(int i : arr){
			System.out.print(i+",");
		}
		System.out.println();
	}
	public void test2(){
		String info = "1001#terry#12";
		String[] arr = info.split("#");

		String idStr = arr[0];
		String name= arr[1];
		String ageStr = arr[2];
		//封装为Student对象 long id,String name,int age



	}
	//测试从标准输入中获取用户的输入
	public void test1(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("请输入整数：");
			//可以造成代码的阻塞，直到用户输入回车
			String i = sc.nextLine();
			System.out.println("i:"+i);
		}
	}
}