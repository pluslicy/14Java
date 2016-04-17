package com.briup.ch04;
/**
	学生类，用来构建学生，存储学生的信息
 */
public class Student {
	private long id;
	public String name;
	private int age;

	/**
	  系统默认构造函数
	*/
	public Student(){
		
	}

	/**
	  说你好的方法
	*/
	public void sayHello(){
		System.out.println(this.name+"说 hello");
	}

	/**
	  加法方法
	*/
	public int add(int a,int b){
		return a+b;
	}

	public void show99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}
}