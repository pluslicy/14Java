package com.briup.ch08;

public class Loop {
	public static void main(String[] args){
		Loop loop = new Loop();
		loop.test6();
	}
	//99乘法表
	public void test6(){
		// 1*9 = 9  2*9 = 18  3*9 = 27
		for(int j=1;j<=9;j++){
			// j = 3
			for(int i=1;i<=j;i++){
				String space = "  ";
				if(i*j<10){
					space="   ";
				}
				System.out.print(i+"*"+j+" = "+i*j+space);
			}
			System.out.println();
		}
		
	}
	//1~10偶数   2 4 6 8 10 
	public void test5(){
		int total = 0;
		int i;
		for(i=1;i<=10;i++){
			if(i%2 != 0){
				continue;//结束当前循环，继续下一次循环
			}	
			total += i;
		}
		System.out.println("for(1~10) total:"+total+",i:"+i);
	}
	//while
	public void test4(){
		int total = 0;
		int i=1;
		while(true){
			total += i;
			i++;
			if(i==101){
				break;
			}
		}
		System.out.println("while(true) total:"+total+",i:"+i);
	}

	//do-while
	public void test3(){
		int total = 0;
		int i=1;
		do{
			total +=i;
			i++;
		}while(i<=100);
		System.out.println("do-while total:"+total+",i:"+i);
		/*
		   int total = 0;
		   int i=1;
		   total += i;	//total = 1
		   i++;			// i= 2
		   i<=100		// true
		   total+=i		//total = 3
		   i++;			// i= 3
		   i<=100		// true
		   ....
		   i++;			//i=101
		   i<=100		//false
		
		
		*/
	}
	//while
	public void test2(){
		int total = 0;
		int i=1;
		while(i<=100){
			total+=i;
			i++;
		}
		System.out.println("while total:"+total+",i:"+i);
	}
	// 1~100和，for
	public void test1(){
		int total = 0;
		int i;
		for(i=1;i<=100;i++){
			total += i;//total = total + i;
		}
		System.out.println("total:"+total+",i:"+i);
		/*
			int total = 0;
			int i=1;
			i<=100;	//true
			total+=i;// total = 1;
			i++;	//2
			i<=100	//true
			total+=i//3
			i++;
			...
			i++;//101
			i<=100//false
		
		*/
	}

}