package com.briup.ch15;

public class Test {
	public static void main(String[] args){
		new Test().test1();	
	}

	public void test1(){
		Animal dog = new Dog();

		dog.setName("һ��");
		dog.setAge(2);
		//dog.setColor("���ɫ");

		dog.move();
		//dog.kanmen();


	/*
		System.out.println("��һ������"+dog.getName()+",��"+dog.getAge()+"���ˣ�����һ��"+dog.getColor()+"ë");
		System.out.println(dog.toString());
		Bird bird = new Bird();
		bird.setName("������");
		bird.move();
	*/
	}
}