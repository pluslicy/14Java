package com.briup.ch14;

public class Test {
	public static void main(String[] args){
		new Test().test4();
	}
	public void test4(){
		Student stu = new Student();
		stu.setId(1001);
		System.out.println("stu:"+stu);

	}
	public void test3(){
		Student stu = new Student(1001,"terry",12);
		Student stu2 = stu;
		stu2 = new Student(1001,"larry",13);
		System.out.println("stu:"+stu);
		System.out.println("stu2:"+stu2);
	}
	//引用传递
	public void test2(){
		Student stu = new Student(1001,"terry",12);
		Student stu2 = stu;
		stu2.setAge(13);
		System.out.println("stu:"+stu);
		System.out.println("stu2:"+stu2);
	}
	//值传递
	public void test1(){
		int a = 3;
		int b = a;
		++b;
		System.out.println("a:"+a);//3
		System.out.println("b:"+b);//4
	}
}