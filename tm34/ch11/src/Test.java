package com.briup.ch11;

import java.util.Scanner;
import java.util.Arrays;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test3(){
		String[] firstNames = {"��","��","��","��"};
		System.out.println(Arrays.binarySearch(firstNames,"��"));
	}

	public void test2(){
		String str1 = "hello";
		String str2 = new String("Hello");
		
		System.out.println(str1 == str2);	//�Ƚϵ����ڴ��ַ
		System.out.println(str1.equalsIgnoreCase(str2));	//�Ƚϵ��ַ�����

		String str = "1001#terry#12";
		String[] arr = str.split("#");// {"1001","terry","12"}
		for(String s : arr){
			System.out.println(s);
		}
	}


	/**
		����Scanner���ӱ�׼�����л�ȡ�û����롣
	*/
	public void test1(){
		Scanner sc = new Scanner(System.in);

		while(true){
			String i = sc.nextLine();
			System.out.println("���յ���"+i);
		}
		
	}
}