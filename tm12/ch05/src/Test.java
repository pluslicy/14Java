package com.briup.ch05;

/**
  测试类，main，驱动程序的运行
 */
public class Test {
	public static void main(String[] args){
		test2();
	}
	public static void test2(){
		Student stu1 = new Student(1001,"terry",12);	//学生对象的实例化，创建对象
		System.out.println(stu1);

		Student stu2 = new Student();	//学生对象的实例化，创建对象
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);
	}
	public static void test1(){
		 //学生类型变量的声明
		/**
		  1. 将Student类加载到内存
		  2. 根据类开辟内存空间，保存学生对象的信息
		  3. 系统将对象中的属性值进行初始化
		  4. 调用构造函数完成客户自定义初始化
		  5. 将该对象的内存地址返回
		*/
		int a = 3;
		Student stu1 = new Student();	//学生对象的实例化，创建对象
		stu1.setId(1001);
		stu1.setName("terry");
		stu1.setAge(12);

		System.out.println(stu1);
		System.out.println("stu1 id:"+stu1.getId());
		System.out.println("stu1 name:"+stu1.getName());
		System.out.println("stu1 age:"+stu1.getAge());

		Student stu2 = new Student();	//学生对象的实例化，创建对象
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);

		System.out.println(stu2);
		System.out.println("stu2 id:"+stu2.getId());
		System.out.println("stu2 name:"+stu2.getName());
		System.out.println("stu2 age:"+stu2.getAge());
	}
}

