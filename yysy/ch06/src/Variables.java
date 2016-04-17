package com.briup.ch06;

public class Variables {
	public int a;
	public void test3(){
		int b =4;
		System.out.println("test3 b:"+b);
		if(b>1){
			int c =5;
			System.out.println("test1 {} b:"+b);
			System.out.println("test1 {} c:"+c);
		}
	}
	public void test1(){
		System.out.println("test1 a:"+a);
	}
	public void test2(){
		System.out.println("test2 a:"+a);
	}
	//ÖÇÁªÕÐÆ¸ Html5 /CSS3	js  (webui)
	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.test1();//a = 0
		vrs.a++;	//a = 1
		vrs.test2();//a = 0
		vrs.test3();
	
	}

}