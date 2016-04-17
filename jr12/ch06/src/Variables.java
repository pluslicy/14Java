package com.briup.ch06;

public class Variables {
	public int a;
	public void test1(){
		int b = 3;
		if(b>1){
			int c = 4;
			System.out.println("test1 {} c:"+c);
		}
		//System.out.println("test1 c:"+c);
		System.out.println("test1 a:"+a);
		System.out.println("test1 b:"+b);
	}
	public void test2(){
		System.out.println(this+"test2 a:"+a);
		//System.out.println(this+"test1 b:"+b);
	}
	public void test3(){
		for(int i=0;i<=10;i++){
		
		}
		for(int i=0;i<=10;i++){
		
		}
	}


	//jvm调用main方法  Variables.main();
	public static void main(String[] args){
		Variables vrs = new Variables();//vrs.a=0
		vrs.test1();//0					//vrs.a=1
		vrs.test2();//1	
		vrs.test3();

		//Variables vrs2 = new Variables();//vrs2.a=0
		//vrs2.test2();					//	
	}
}