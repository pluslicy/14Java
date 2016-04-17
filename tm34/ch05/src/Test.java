package com.briup.ch05;

/**
  测试类
 */
public class Test{
	public static void main(String[] args){
		//将土木3班所有学生的信息保存到对象中
		/*
		  1. 将Student类加载到内容中。
		  2. 根据Student类（模板）开辟内存空间，创建学生对象
		  3. jvm对对象中的属性进行初始化，
		        char		 
			    有符号整数   0
				有符号小数   0.0
				布尔类型     false
				引用数据类型 null
		  4. 调用构造函数完成对象的初始化
		  5. 将该对象在内存中的首地址进行返回
		*/
		Student stu1 = new Student(1001,"terry",12);
		System.out.println(stu1);
		Student stu2 = new Student(1002,"larry",13);
		System.out.println(stu2);

		/*
		System.out.println("stu1 id:"+stu1.getId());
		System.out.println("stu1 name:"+stu1.getName());
		System.out.println("stu1 age:"+stu1.getAge());

		Student stu2 = new Student();
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