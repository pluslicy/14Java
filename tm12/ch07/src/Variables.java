package com.briup.ch07;

public class Variables {
	public char a;		//�Ǿ�̬����
	public static int b;//��̬����

	public void aa(){	//�Ǿ�̬����
		System.out.println("--aa--");
	}
	public static void bb(){
						//��̬����
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