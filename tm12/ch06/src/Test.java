package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		//保存江西理工大学，华东交大的信息
		/**
		   1. 将Student类加载到内存中。
		   2. 根据Student类（模板）开辟内存空间。
		   3. jvm初始化属性
				char '\u0000'  a
				byte	0
				short	0
				int		0
				long	0L
				float	0.0F
				double	0.0D
				boolean	false
				引用	null
			4.调用构造函数进行初始化
			5.将对象在堆内存中的内存地址赋给sc1
		*/
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("江西理工大学");
		sc1.setAddress("江西南昌");
		System.out.println(sc1);

		School sc2 = new School(1002,"华东交大","江西南昌");
		System.out.println(sc2);
		
	}
}