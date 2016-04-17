package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		int a = 12;
		//对象的实例化，创建对象
		/**
			1. 加载Student类
			2. 根据Student类在堆内存中开辟内存空间
			3. JVM将对象中的属性初始化
			4. 调用构造函数完成客户初始化
			5. 将堆内存首地址返回给stu1
		*/
		Student stu1 = new Student(1001,"张三",22);
		System.out.println(stu1);

		Student stu2 = new Student();
		//访问对象的属性和方法   .
		stu2.setId(1002);
		stu2.setName("李四");
		stu2.setAge(23);
		System.out.println(stu2);
	
		/*

		Student stu2 = new Student();
		//访问对象的属性和方法   .
		stu2.setId(10002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);

	/*
		System.out.println("id:"+stu1.getId());
		System.out.println("name:"+stu1.getName());
		System.out.println("age:"+stu1.getAge());
		System.out.println(stu2);
		System.out.println("id:"+stu2.getId());
		System.out.println("name:"+stu2.getName());
		System.out.println("age:"+stu2.getAge());

	*/
	}
}