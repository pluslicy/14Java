package com.briup.ch14;

public class Test{
	public static void main(String[] args){
		new Test().test2();
	}
	public void test2(){
		Animal a = new Dog("一休",2,"金黄色");
		System.out.println("Bird:"+(a instanceof Bird));
		System.out.println("Dog:"+(a instanceof Dog));
		System.out.println("Animal:"+(a instanceof Animal));
		System.out.println("Object:"+(a instanceof Object));
	}
	public void test1(){
		Animal dog = new Dog("一休",2,"金黄色");
		System.out.println(dog);
		dog.move();
	}
}