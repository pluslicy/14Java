package com.briup.ch14;

public class Test {
	public static void main(String[] args){
		new Test().test5();
	}	
	public void test5(){
		/*
		Teacher t1 = new Teacher();
		System.out.println(t1);

		Teacher t2 = new Teacher(10000.0);
		System.out.println(t2);
		*/
		Teacher t3 = new Teacher();
		System.out.println(t3);
	}
	public void test4(){
		OverLoad load = new OverLoad();
		load.add(1.0,1.1,1.2);
	}
	public void test3(){
		Student stu = new Student();
		stu.setId(1001);
		System.out.println(stu);

		Student stu2 = new Student();
		stu2.setId(1003);
		System.out.println(stu2);
	}

	public void test2(){
		Student stu = new Student(1001,"terry",12);
		Student stu2 = stu;
		stu2.setId(1002);
		System.out.println(stu);
		System.out.println(stu2);
		
	}

	public void test1(){
		int a = 3;
		int b = a;
		b++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}