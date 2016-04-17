package com.briup.ch11;

public class Test {
	public static void main(String[] args){
		String str = "1001#terry#12";
		// {"1001","terry","12"}
		String[] arr = str.split("#");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}