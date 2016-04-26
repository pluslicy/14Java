package com.briup.ch14;

public class Test {
	public static void main(String[] args){
		new Test().test4();
	}
	public void test4(){
		Dog dog = new Dog();
		dog.setName("一休");
		dog.setAge(3);
		dog.setColor("金黄色");
		
		System.out.println(dog.getName()+"这个狗"+dog.getAge()+"岁了，它有"+dog.getColor()+"的毛");
	}

	//测试构造函数
	public void test3(){
		Student stu = new Student();
		System.out.println(stu);

		Student stu2 = new Student(1002);
		System.out.println(stu2);
	}
	public void test2(){
		String str = "hello world";
		String a = str.substring(1);
		String b = str.substring(1,5);
		System.out.println(a);
		System.out.println(b);
	}
	public void test1(){
		Util util = new Util();
		util.add();
		util.add(1,2);
		util.add(1.0,3.0);
	}
}