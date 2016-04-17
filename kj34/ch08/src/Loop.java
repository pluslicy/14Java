package com.briup.ch08;

public class Loop{
	public static void main(String[] args){
		Loop loop = new Loop();
		int total = loop.test4();
		System.out.println("total:"+total);
	}
	// 1~10֮��ż���ĺ�  2 4 6 8 10 
	public int test4(){
		int total = 0;
		int i=0;
		while(true){
			i++;
			if(i > 10){
				break;
			}
			if(i%2 != 0){
				continue;
			}
			total += i;
		}
		return total ;
	}
	public int test3(){
		int total = 0;
		int i=1;
		do{
			total +=i;			
			i++;
		}while(i<=100);
		return total;
		/*
			int total = 0;
			int i=1;

			total +=i	//total 1
			i++			//i		2
			i<=100		//true

			total +=i	//total 3
			i++			//i		3
			i<=100		//true 

			...
			
			total +=i	//
			i++			//i	101
			i<=100		//false
		
		
		*/
	}
	//����whileѭ�� 1~100֮��
	public int test2(){
		int total = 0;
		int i=1;
		while(i<=100){
			total += i;
			i++;	// total = total + i; i++;
		}
		return total;
		/*
		  int total = 0;
		  int i=1

		  i<=100	//true
		  total+=i	//total 1
		  i++		//i  2

		  i<=100	//true
		  total+=i	//total 3
		  i++		//i 3
		  
		  i<=100	//true
		  total+=i	//total 6
		  i++		//i 4

		  ...
		  i++		//i 101

		  i<=100	//false ����
		  
		
		*/
	}
	//����forѭ�� 1~num֮��
	public int test1(int num){
		int total= 0;
		int i;
		for(i=1;i<=num;i++){
			total += i;
		}
		System.out.println("i:"+i);
		return total;
		/*
			int total = 0;
			int i;
			i=1;

			i<=100		//  true
			total+=i	//total = 1
			i++			//i=2

			i<=100		//  true
			total+=i
			i++

			...
			i++			//i = 101
			i<=100		//false
		*/
	}
}