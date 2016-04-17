package com.briup.ch09;

public class Loop {
	public static void main(String[] args){
		Loop loop = new Loop();
		loop.test3();
	}

	public void test3(){
		int x = 4;
		double result = (x>4)?99.9:9;
		System.out.println("result:"+result);
	}

	public void test2(){
		int total = 0;
		int i=0;
		loop1:while(true){
			i++;
			if(i>10){
				break loop1;
			}
			if(i%2 != 0){
				continue loop1;
			}
			total += i;
		}
		System.out.println("while total:"+total);
	}
	//1~10
	public void test1(){
		int total = 0;
		for(int i=1;i<=10;i++){
			if(i%2 != 0){
				continue;
			}
			total += i;
		}
		System.out.println("total:"+total);
	}
}