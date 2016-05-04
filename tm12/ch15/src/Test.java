package com.briup.ch15;

public class Test{
	public static void main(String[] args){
		new Test().test1();	
	}
	public void test1(){
		Animal dog = new Dog("Ò»ÐÝ",2,"½ð»ÆÉ«");
		dog.move();
		//dog.kanmen();


		System.out.println("Bird:"+(dog instanceof Bird));
		System.out.println("Dog:"+(dog instanceof Dog));
		System.out.println("Animal:"+(dog instanceof Animal));
		System.out.println("Object:"+(dog instanceof Object));
	}
}