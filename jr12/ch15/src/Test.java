package com.briup.ch15;

public class Test {
	public static void main(String[] args){
		new Test().test4();	
	}
	public void test4(){
		Animal bird = new Bird("八哥",1,"大鸟");
		System.out.println(bird instanceof Animal);
		System.out.println(bird instanceof Bird);
		System.out.println(bird instanceof Object);
		System.out.println(bird instanceof Dog);
	}
	public void test3(){
		Object bird = new Bird("八哥",1,"大鸟");
		if(bird instanceof Animal){
			Animal niao = (Animal)bird;
			niao.move();
		}else{
			System.out.println("不能转换");
		}
		
		
	}
	public void test2(){
		Bird bird = new Bird("八哥",1,"大鸟");
		bird.speak();
		bird.move();

		Dog dog = new Dog("一休",1,"金黄色");
		dog.move();

		Animal a = new Bird("八哥2",1,"大鸟");
		a.move();

	}
	public void test1(){
		/*
		Dog dog = new Dog("一休",1,"金黄色");
		System.out.println(dog);
		dog.move();

		Animal bird = new Bird("八哥",1,"大鸟");
		bird.move();
		bird.speak();
		*/
	}
}