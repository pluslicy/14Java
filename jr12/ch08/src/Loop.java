package com.briup.ch08;

public class Loop {
	public static void main(String[] args){
		Loop loop = new Loop();
		loop.test3();
	}
	public void test3(){
		int total = 0;
		int i=1;
		do{
			total += i;	
			i++;
		}while(i<=100);
		System.out.println("do-while total: "+total+",i: "+i);
	}
	//while循环
	public void test2(){
		int total = 0;
		int i=1;
		while(i<=100){
			total += i;
			i++;
		}
		System.out.println("while total: "+total+",i: "+i);
		/*
			int total = 0;
			int i=1;

			i<=100
			total +=i	//total = 1
			i++			//i = 2

			i<=100
			total +=i	//total = 3
			i++			//i =3

			...
			i++			// i=101

			i<=100		//false

		
		*/
	}
	// for循环 1 ~ 100 累加 （高斯）
	public void test1(){
		int total = 0;
		int i;
		for(i=1;i<=100;i++){
			total += i;
		}
		System.out.println("for total: "
					+total+",i: "+i);
		/*
			int total = 0;
			//int i=1		//i=1
			int i;
			i = 1;

			i<= 100		//true
			total += i	//total = 1
			i++;		//i=2

			i<=100		//true
			total +=i	//total 3
			i++			//i=3

			...
			i++			//101

			i<=100		//false
		
		*/
	}
}