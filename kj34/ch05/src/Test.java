package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		int a = 3;
		//实例化,创建类的对象
		Student stu = new Student(1001,"terry",12);
		System.out.println(stu);

		Student stu2 = new Student(1002,"larry",13);
		System.out.println(stu2);

		/*
		System.out.println("stu id:"+stu.getId());
		System.out.println("stu name:"+stu.getName());
		System.out.println("stu age:"+stu.getAge());
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);
		System.out.println("stu2 id:"+stu2.getId());
		System.out.println("stu2 name:"+stu2.getName());
		System.out.println("stu2 age:"+stu2.getAge());
		*/
	}
}