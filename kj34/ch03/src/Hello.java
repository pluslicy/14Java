package com.briup.ch03;

public class Hello {
	public static void main(String[] args){
		//创建学生对象
		Student stu = new Student();
		stu.name = "张三";
		stu.sayHello(); 
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}
}