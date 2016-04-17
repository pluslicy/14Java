package com.briup.ch09;

public class Loop {
	public static void main(String[] args){
		Loop loop = new Loop();
		loop.test3();
	}	
	public void test3(){
		int x = 4;
		
		double result = (x>4)?99.9:9;
		System.out.println(result);
	}
	/**
	  1~10之间所有偶数的和
	  2 4 6 8 10 
	*/
	public void test2(){
		int i=0;
		int total = 0;
		while(true){
			i++;			
			if(i>10){
				break;
			}
			if(i%2 != 0){
				continue;
			}
			total += i;
		}
		System.out.println("while total:"+total);
	}
	/**
	  1~10之间所有偶数的和
	  2 4 6 8 10 
	*/
	public void test1(){
		int total = 0;
		loop1:for(int i=1;i<=10;i++){
			if(i%2 != 0){
				continue loop1;
			}
			total+=i;
		}
		System.out.println("total:"+total);
	}
}