package com.briup.ch03;

public class Hello {
	public static void main(String[] args){
		//����ѧ������
		Student stu = new Student();
		stu.name = "����";
		stu.sayHello(); 
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}
}