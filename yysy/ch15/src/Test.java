package com.briup.ch15;

public class Test {
	public static void main(String[] args){
		new Test().test1();	
	}

	public void test1(){
		Animal dog = new Dog();

		dog.setName("一休");
		dog.setAge(2);
		//dog.setColor("金黄色");

		dog.move();
		//dog.kanmen();


	/*
		System.out.println("有一条狗叫"+dog.getName()+",它"+dog.getAge()+"岁了，它有一身"+dog.getColor()+"毛");
		System.out.println(dog.toString());
		Bird bird = new Bird();
		bird.setName("百灵鸟");
		bird.move();
	*/
	}
}