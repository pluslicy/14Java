package com.briup.ch09;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test3(){
		int[] arr = {3,2,1,5,10,9};
		showArray(arr);
		//排序 
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		showArray(arr);
	}
	public void showArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
	public void test2(){
		String[] arr;
		arr = new String[]{"terry","larry",null,null,null};
		System.out.println("数组的长度："+arr.length);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
	}
	public void test1(){
		Ages ages = new Ages(21,21,20,19,21);
		/*
		Ages ages = new Ages();
		ages.age1 = 21;
		ages.age2 = 21;
		ages.age3 = 20;
		ages.age4 = 19;
		ages.age5 = 21;
		*/
		System.out.println(ages.age3);
		
	}
}
