package com.briup.ch03;

/**
 *���ǵڶ���java�࣬main��������showHello����
 *@author: licy
 *@date:2016.3.8
 */
public class Socend {
	/**
	 * �����������ʾhello+����
	 * @param String name
	 * @return void
	 */
	public static void showHello(String name){
		//����ע��
		System.out.println("hello "+name);
	}
	/**
	 * �����������
	 */
	public static void main(String[] args){
		/*
		   ����ע��
		   ���������api��
		*/
		showHello("����");
		char a = 64; // 10����
		System.out.println(a);
		char a2 = '@';
		System.out.println(a2);
		char a3 = 0x40;  //16����
		System.out.println(a3);
		char a4 = 0100;  //8����
		System.out.println(a4);
		System.out.println("----------");
		// byte short int long
		int b = 110;
		System.out.println(b);
		long b2 = b;
		System.out.println(b2);
        short b3 = b;
		System.out.println(b3);
		byte b4 = b;
		System.out.println(b4);
	}
}