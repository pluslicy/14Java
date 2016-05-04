package com.briup.ch16;

public class Test{
	public static void main(String[] args){
		new Test().test2();
	}
	public void test2(){
		Person p = new Person();
		p.name = "terry";
		p.number = 10000;

		Person p2 = new Person();
		p2.name = "larry";
		p2.number = 20000;

		System.out.println(p.name+"--"+p.number);
		System.out.println(p2.name+"--"+p2.number);
	}
	public void test1(){
		System.out.println(Person.number);
		System.out.println(Person.number);
		//Person.move();
	}
}
