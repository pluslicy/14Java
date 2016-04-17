package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		/**
		  1. 类加载，将Teacher类加载到内存中
		  2. 根据Teacher类（模板）在堆内存中开辟内存空间
		  3. jvm会对对象中的属性进行初始化（使用默认值来初始化）
		  4. 执行构造函数中的代码完成客户初始化
		  5. 将堆内存中该对象的内存首地址返回
		*/
		Teacher tea1 = new Teacher();
		tea1.setId(1001L);
		tea1.setName("terry");
		tea1.setSalary(20000.0D);
		System.out.println(tea1);

		Teacher tea2 = new Teacher(1002L,"larry",30000.0D,'男');
		System.out.println(tea2);
	}
}