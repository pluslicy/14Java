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
		String name = "����";
		String firstName =  name.substring(0,1);
		System.out.println("firstName:"+firstName);
		System.out.println(firstName+"����");
		String a = "1001#terry#12";
		String[] arr = a.split("#");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}

		System.out.println("briup".equals("briup"));
	}
	//ɨ����Ļ��ȡ����
	public void test1(){
		//����ɨ�������󣬼�ر�׼����
		Scanner sc = new Scanner(System.in);
		//�ӱ�׼�����л�ȡ��������  ����[�س�]
		while(true){
			System.out.println("�����룺");
			String i = sc.nextLine();
			System.out.println("���յ���:"+i);
		}
	
	}
}