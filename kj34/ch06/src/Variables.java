package com.briup.ch06;

public class Variables {
	public int a;//实例变量，对象属性


	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.test1();
		vrs.test2();
	}

	public void test1(){
		int b =3;
		
		System.out.println("test1 a:"+a);
		System.out.println("test1 b:"+b);

		{
			int c = 4;
			System.out.println("test1 {} b:"+b);
			System.out.println("test1 {} c:"+c);
			
		}
	}
	public void test2(){
		System.out.println("test2 a:"+a);
	}
}