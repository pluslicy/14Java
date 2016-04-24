package com.briup.ch14;

public class Test{
	public static void main(String[] args){
		new Test().test4();
	}
	public void test4(){
		Math math = new Math();
		math.add(1,2);
		math.add(1.0,2);
	}
	public void test3(){
		Student stu = new Student();
		stu.setId(1001L);
		System.out.println(stu);

		Student stu2 = new Student();
		stu2.setId(1001L);
		System.out.println(stu2);

	}
	public void test2(){
		Student stu = new Student(1001,"terry",12);
		Student stu2 = new Student(1001,"terry",12);
		stu2.setAge(13);
		System.out.println("stu:"+stu);
		System.out.println("stu:"+stu2);
	}
	public void test1(){
		int a = 3;
		int b = a;
		++b;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}