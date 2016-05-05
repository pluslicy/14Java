package com.briup.ch16;

import com.briup.ch15.Student;

public class Test extends Student{
	public void test1(){
		Student stu = new Student();
		//stu.name = "terry";
		stu.setName("terry");
		super.age = 3;
		System.out.println(super.age);
	}
	public static void main(String[] args){
		new Test().test1();
	}
}