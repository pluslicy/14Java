package com.briup.ch16;

public class StaticTest {
	public static void main(String[] args){
		new StaticTest().test3();	
	}
	public void test3(){
		Country c = new Province();
		c.qukc();
		c.qucn();


	}
	public void test2(){
		//����ص�ʱ��̬���Ժ;�̬������ʼ��
		System.out.println(Student.number);
		Student.test();
	
	}
	public void test1(){
		Student stu = new Student();
		stu.name = "terry";

		Student stu2 = new Student();
		stu2.name = "larry";
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		new Student();
		

		System.out.println(stu.name);
		System.out.println(stu2.name);
		System.out.println("������"+Student.number+"������");
	}
}