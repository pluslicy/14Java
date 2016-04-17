package com.briup.ch09;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test2();
	}
	public void test2(){
		// 1~10之间的偶数 continue break
		int result = 0;
		int i=1;
		while(true){
			if(i>10){
				break;
			}
			if(i%2 == 0){
				result +=i;
			}
			i++;
		}
		System.out.println(result);
	}
	public void test1(){
		int total = 0;
		// 2 4 6 8 10
		for(int i=1;i<=10;i++){
			if(i%2 != 0){
				continue;
			}
			total +=i;
		}
		System.out.println(total);
	}
}