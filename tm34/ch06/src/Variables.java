package com.briup.ch06;

public class Variables {
	//���� ��ʵ��������ȫ�ֱ���
	public int a;
	/**
	  �Ǿ�̬��������������ʱ���ʼ��
	*/
	public void test1(){
		int b = 4 ;

		if(b>3) {
			int c = 5;
			System.out.println("test1 {} a:"+a);
			System.out.println("test1 {} c:"+c);
		}
		System.out.println("test1 a:"+a);
		System.out.println("test1 b:"+b);
		//System.out.println("test1 c:"+c);

	}
	public void test2(){
		System.out.println("test2 a:"+a);
	}
	public void test3(int d){
		int a = 3;
		System.out.println("test3 d:"+d);
		System.out.println("test3 ȫ�� a:"+this.a);
		System.out.println("test3 �ֲ� a:"+a);
	}

	public void test4(){
		for(int i=0;i<=10;i++){
			
		}
		for(int j=0;j<=10;j++){
			
		}
		for(int k=0;k<=10;k++){
			
		}
	}

	/**
	  ��̬�����������ʱ���ʼ��
	  jvm����� Variables.main();
	*/
	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.test1();
		vrs.test2();
		vrs.test3(6);
	}
}