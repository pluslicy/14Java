package com.briup.ch09;

public class Converse{
	public static void main(String[] args){
		Converse cv = new Converse();
		cv.test2(3);
	}
	public void test2(int x){
		float result = (x>3)?99.9F:9;
		System.out.println(result);
	}
	public void test1(){
		char a ='A' ;
		long b = a;
		float f = 3;
		float f2 = 3.0F;
		System.out.println(b);
	}
}