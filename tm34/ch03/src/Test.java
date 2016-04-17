package com.briup.ch03;

public class Test
{
	public static void main(String[] args){
		com.briup.ch03.Student zhangsan;
		//实例化  由类创建对象过程
		zhangsan = new Student();	
		zhangsan.name = "张三";
		zhangsan.sayHello();
		/*
		   第一行
		   第二行
		*/
		Student stu = new Student();
		stu.name = "李四";
		stu.sayHello();
	}
}