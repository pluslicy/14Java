package com.briup.ch07;

public class Test{
	public static void main(String[] args){
		//保存学校信息
		/**
		  1.类加载，将School类加载到内存中
		  2.根据School类（模板）在堆内存中开辟空间
		  3.jvm会对对象中的变量（id,name,address）进行初始化（默认值）
		  4.调用构造函数完成顾客初始化
		  5.将该对象所在的内存首地址返回给变量
		*/
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("江西理工");
		sc1.setAddress("江西南昌");
		System.out.println(sc1);

		School sc2 = new School(1002L,"华东交大","江西南昌");
		System.out.println(sc2);
	}
}