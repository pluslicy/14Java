package com.briup.ch09;

public class Converse {
	public static void main(String[] args){
		Converse converse = new Converse();
		converse.test2();
	
	}	


	//������������ ��ʽת��
	public void test2(){
		Student stu = new Student();
		Object o = stu;

		Student stu2 = (Student)o;

		System.out.println("stu:"+stu);
	}

	//������������ ��ʽת��
	public void test1(){
		double a = 2;
		float b = (float)a;
		System.out.println("b:"+b);
	}
}