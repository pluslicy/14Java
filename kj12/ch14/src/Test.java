package com.briup.ch14;

public class Test{
	public static void main(String[] args){
		new Test().test1();
	}
	public void test1(){
		Animal dog = new Dog("һ��",2,"���ɫ");

		System.out.println(dog);
		dog.move();
	//	dog.sleep();

	}
}