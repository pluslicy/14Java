package com.briup.ch15;

public class Test {
	public static void main(String[] args){
		new Test().test4();	
	}
	public void test4(){
		Animal bird = new Bird("�˸�",1,"����");
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Object);
		System.out.println(bird instanceof Dog);
	}
	public void test3(){
		Object bird = new Bird("�˸�",1,"����");
		if(bird instanceof Animal){
			Animal niao = (Animal)bird;
			niao.move();
		}else{
			System.out.println("����ת��");
		}
		
		
	}
	public void test2(){
		Bird bird = new Bird("�˸�",1,"����");
		bird.speak();
		bird.move();

		Dog dog = new Dog("һ��",1,"���ɫ");
		dog.move();

		Animal a = new Bird("�˸�2",1,"����");
		a.move();

	}
	public void test1(){
		/*
		Dog dog = new Dog("һ��",1,"���ɫ");
		System.out.println(dog);
		dog.move();

		Animal bird = new Bird("�˸�",1,"����");
		bird.move();
		bird.speak();
		*/
	}
}