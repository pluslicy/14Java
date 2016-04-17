package com.briup.ch09;

public class ArrayTest{
	public static void main(String[] args){
		ArrayTest test  = new ArrayTest();
		test.test2();
	}
	public void test2(){
		Student[] stus = new Student[5];
		Student[] stus2 = new Student[]{
				new Student(1001,"terry",12),
				new Student(1002,"larry",13),
				new Student(1003,"jacky",14)
		};
		
		for(int i=0;i<stus2.length;i++){
			System.out.println(stus2[i]);
		}
	}

	//测试数组的声明，初始化，使用
	public void test1(){
		//声明
		//int[] arr;	
		//初始化
		//arr = new int[5];
		//arr = new int[]{9,9,93,2,1};
		int[] arr = {1,2,3,4};
		//使用
		showArray(arr);
	
	}
	public void showArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		//换行
		System.out.println();
	}
}