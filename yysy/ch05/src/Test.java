package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		/**
		实例化（对象的创建）
			1.类加载： 将Student类（模板）加载到内存中
			2.根据Student类（模板）在堆内存中开辟空间
			3.jvm将对象中的变量进行了初始化（使用默认值）
			4.调用构造函数完成顾客初始化
			5.将对象的内存首地址返回
		 */
		Student stu1 = new Student();
		stu1.setId(1001L);
		stu1.setName("张三");
		stu1.setGender("男");
		System.out.println(stu1);

		Student stu2 = new Student(1002L,"李四","男");
		System.out.println(stu2);


	}
}