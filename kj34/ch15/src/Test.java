package com.briup.ch15;

public class Test{
	public static void main(String[] args){
		new Test().test1();
	}
	public void test1(){
		Animal dog = new Dog("一休",3,"金黄色");
		test2(dog);
		Animal a = new Bird();
		test2(a);
		//dog.move();
		//dog.kanmen();
		//System.out.println("Bird:"+(dog instanceof Bird));
		//System.out.println("Dog:"+(dog instanceof Dog));
		//System.out.println("Animal:"+(dog instanceof Animal));
		//System.out.println("Object:"+(dog instanceof Object));
	}

	public void test2(Animal a){
		if(a instanceof Dog){
			Dog dog = (Dog)a;
			dog.kanmen();
		}else{
			System.out.println("不是狗！");
		}
		
	}
}