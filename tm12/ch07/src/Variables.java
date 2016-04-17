package com.briup.ch07;

public class Variables {
	public char a;		//非静态属性
	public static int b;//静态属性

	public void aa(){	//非静态方法
		System.out.println("--aa--");
	}
	public static void bb(){
						//静态方法
		System.out.println("--bb--");
	}
	public static void main(String[] args){
		Variables vrs = new Variables();
		vrs.aa();
		bb();
		System.out.println("|"+vrs.a+"|");
		System.out.println("|"+b+"|");
	}
}