package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		int a = 3;
		int b = 4;

		//实例化
		Student stu1 = new Student(1001,"张三",22);
		System.out.println(stu1);
		
		new Teacher();
	

		/*
		stu1.setId(1001);
		stu1.setName("terry");
		stu1.setAge(12);
		System.out.println(stu1);

		//实例化
		Student stu2 = new Student();
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);
		/*
		System.out.println("stu1, id:"+stu1.getId());
		System.out.println("stu1, name:"+stu1.getName());
		System.out.println("stu1, age:"+stu1.getAge());
		System.out.println("stu2, id:"+stu2.getId());
		System.out.println("stu2, name:"+stu2.getName());
		System.out.println("stu2, age:"+stu2.getAge());
		*/
	}
}