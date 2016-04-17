package com.briup.ch08;

public class Loops {
	public static void main(String[] args){
		Loops loop = new Loops();
		loop.test3();
	}
	//do - while
	public void test3(){
		int total = 0;
		int i=1;
		do{
			total+=i;
			i++;
		}while(i<=100);
		System.out.println("total3:"+total);
	}
	//while
	public void test2(){
		int total = 0;
		int i=1;
		while(i<=100){
			total+=i;
			i++;
		}
		System.out.println("total2:"+total);
		/*
		   int i=1;
		   i<=100;
		   total+=i;
		   i++;
		   i<=100;
		   total+=i;
		   i++;
		*/
	}
	//forÑ­»·
	public void test1(){
		int total = 0;
		for(int i=1;i<=100;i++){
			total += i;
		}
		/*
		int i=1;
		i<=100;
		total+=i;
		i++;
		i<=100;
		total+=i;
		i++;
		i<=100;
		...
		*/
		System.out.println("total1:"+total);
	}
}