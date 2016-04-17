package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		//保存江西理工大学，华东交大的信息
		/**
			1. 将School类加载到内存中
			2. 根据School类(模板)在堆中开辟内存空间
			3. jvm对对象中的属性进行初始化
				 char	\u0000  空格
				 byte	0
				 short	0
				 int	0
				 long	0L
				 float	0.0F
				 double	0.0D
				 boolean false
				 引用数据类型   null
					String
					Student
					School
			4. 调用构造函数完成对象的自定义初始化
			5.将该对象在内存中的首地址返回
		 */
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("江西理工大学");
		sc1.setAddress("江西南昌");
		System.out.println(sc1);

		School sc2 = new School(1002L,"华东交大","江西南昌");
		System.out.println(sc2);
	}
}