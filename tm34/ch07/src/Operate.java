package com.briup.ch07;

public class Operate {
	public static void main(String[] args){
		Operate or = new Operate();
		or.test2();
	}
	public void test2(){
		int[] arr = {1,2,3,4};
		int[] arr2 = new int[]{5,6,7,8};
		
		showArray(arr);
		showArray(arr2);
		System.arraycopy(arr, 0, arr2, 0, arr2.length);
	}
	public void showArray(int[] arr){
		for(int a:arr){
			System.out.print(a+",");
		}
		System.out.println();
	}
	public void test1(){
		int x = 3;
		Integer a = 10;
		float result = x>3 ? 9.9F : 10;
		System.out.println("result:"+result);
	}
}