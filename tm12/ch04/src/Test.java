package com.briup.ch04;

import java.math.BigDecimal;

public class Test {
	public static void main(String[] args){
		test4();
	}
	public static void test4(){
		float f1 = 19.1F;
		float f2 = 20.0F;
		System.out.println(f2-f1);
		System.out.println(subtract(f2,f1));
	}
	public static float subtract(float f1,float f2){
		BigDecimal a = new BigDecimal(Float.toString(f1));
		BigDecimal b = new BigDecimal(Float.toString(f2));
		return a.subtract(b).floatValue();

	}
	public static void test3(){
		byte a =65;
		byte b =0101;
		byte c =0x41;
		byte d = 0b1000001;
		long e = 10032232312112L;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(1l-1);
	}
	//测试char
	public static void test2(){
		char c1 = 6;
		char c2 = '6';
		char c3 = 65;
		char c6 = 0101;// 0开头表示八进制
	    char c7 = 0x41;// 4*16^1+1*16^0 0x开头表示十六进制
	    char c8 = 0b1000001;// jdk7中0b开头表示二进制
		System.out.println(c3);
		System.out.println(c6);
		System.out.println(c7);
		System.out.println(c8);
	}

	//测试99乘法表
	public static void test1(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}
}