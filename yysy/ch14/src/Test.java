package com.briup.ch14;

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test9();	
	}
	public void test9(){
		String str = "helloworld";
		String sub1 = str.substring(1);
		System.out.println(sub1);
		String sub2 = str.substring(1,5);
		System.out.println(sub2);
	}
	//测试重载
	public void test8(){
		Math math = new Math();
		math.add(1,2);
		math.add(1.0,2);
		math.add(1,2.0);
		//math.add(1.0,2.0);
	
	}
	//引用传递二
	public void test7(){
		Student stu = new Student(1001,"terry",12);
		System.out.println("before:"+stu);
		changeStudent(stu);
		System.out.println("after:"+stu);
	}
	public void changeStudent(Student stu){
		stu = new Student(1001,"larry",12);
	}
	//引用传递
	public void test6(){
		Student stu = new Student(1001,"terry",12);
		System.out.println("before:"+stu);
		changeName(stu);
		System.out.println("after:"+stu);
	}
	public void changeName(Student stu){
		stu.setName("BIGTERRY");
	}
	//值传递
	public void test5(){
		int a = 3;
		System.out.println("before:"+a);
		increment(a);
		System.out.println("after:"+a);
	}

	public void increment(int a){
		++a;
	}
	public void test4(){
		Student stu 
			= new Student(1001,"terry",12);
		Student stu2 = stu;
		stu2 
			= new Student(1001,"terry",12);
		stu2.setAge(13);
		System.out.println(stu.getAge());
		System.out.println(stu2.getAge());

	}
	public void test3(){
		int a = 3;
		int b = a;
		++b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}


	public void test1(){
		test2("1");
	}
	public void test2(String name){
		System.out.println(name);
	}
}