package com.briup.ch11;

import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("\n������ѧ��������");
			String line = scanner.nextLine();
			test.add(line);
			System.out.println("\n����������ѧ����");
			test.showNames();
		}
	}

	private String[] names = new String[3];//Ĭ������
	private int num=0;	//ʵ�������ĸ���
	public void add(String name){
		if(num>=names.length){
			String[] des = new String[names.length+3];
			System.arraycopy(names,0,des,0,num);
			names = des;
		}
		names[num++] = name;
	}
	public void showNames(){
		for(int i=0;i<num;i++){
			System.out.print(names[i]+",");
		}
	}
	



	//���鿽��
	public void test3(){
		int[] src = new int[]{5,2,4};
		int[] des = new int[6];

		System.arraycopy(src,1,des,0,src.length-1);
		
		showArray(src);
		showArray(des);
	}
	public void showArray(int[] arr){
		for(int a : arr){
			System.out.print(a+",");
		}
		System.out.println();
	}

	//����String�г���API
	public void test2(){
		String str = "hello";
		String str2 = new String("hello");
		System.out.println(str.equals(str2));
		System.out.println(str == str2);

		String info = "1001#terry#12";
		String[] arr = info.split("#");
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	//���Դӱ�׼�����н����û�����
	public void test1(){
		Scanner sc = new Scanner(System.in);
		while(true){
			String line = sc.nextLine();
			System.out.println("���յ���"+line);
		}
		
	}
}