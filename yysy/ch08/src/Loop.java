package com.briup.ch08;

public class Loop{
	public static void main(String[] args){
		Loop loop = new Loop();
		//int result = loop.test5();
		//System.out.println("result:"+result);
		loop.test7();
	}

	public void test7(){
		//1,2,3,4   所有三位数
		/*
			
		*/
		int index = 0;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				for(int k=1;k<=4;k++){
					if(i!=j && j!=k && k!=i){
						index++;
						int num = i*100+j*10+k;
						System.out.print(num+",");
						if(index % 5==0){
							System.out.println();
						}
					}
				}
			}
		}
		System.out.println("\n总共为："+index);
	}
	/*
		99
		1*5= 5  2*5=10  3*5=15  4*5=20  5*5=25
	*/
	public void test6(){
		for(int j=1;j<=9;j++){
			for(int i=1;i<=j;i++){
				String space = "";
				if(i*j<10){
					space = " ";
				}
				System.out.print(i+"*"+j+"="+space+(i*j)+"  ");
				// 1*5= 5  2*5=10  
			}
			System.out.println();
		}
		
	}
	/**
		10!
	*/
	public int test5(){
		int result = 1;
		int i=10;
		while(i>=1){
			result *= i;
			i--;
		}
		return result;
		/*
			i=10;
			i>=1 true
			result = 1*10=10;
			i-- 9
			i>=1 true
			result = 10*9
		*/
	}
	/**
	1~10 累乘
	*/
	public int test4(){
		int result = 1;
		for(int i=1;i<=10;i++){
			result *= i;
		}
		return result;
	}



	/**
	  1~100累加
	  for
	*/
	public int test1(){
		int total = 0;
		for(int i=1;i<=100;i++){
			total += i;
		}
		return total;
		/*
			int total = 0;
			int i=1;
			i<=100 true;
			total = total + i = 0+1 =1;
			i++ i=2
			i<=100 true
			total = total +i = 1+2 = 3;
			i++ i=3
			i<=100
			...i++
			i=101
			i<=100 false
		*/
	}
	/**
	  1~100累加
	  while
	*/
	public int test2(){
		int total = 0;
		int i=1;
		while(i<=100){
			total += i;
			i++;
		}
		return total;
	}
	/**
	  1~100累加
	  do-while
	*/
	public int test3(){
		int total = 0;
		int i=1;
		do{
			total += i;
			i++;
		}while(i<=100);
		return total;
	}
}