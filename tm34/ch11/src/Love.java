package com.briup.ch11;

import java.util.Scanner;

public class Love {
	public static void main(String[] args){
		//  ���� ����  35 ����  map
		System.out.println("*****����ħ������*****");
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�����롾��������#Ů���������������ǵİ���ָ��");
			String names = sc.nextLine();
			String[] arr = names.split("#");
			int num = (int)(Math.random()*100);
			System.out.println(arr[0]+"��"+arr[1]+"�İ���ָ��Ϊ��"+num);
		}
	}
}