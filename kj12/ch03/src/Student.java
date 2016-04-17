package com.briup.ch03;
/**
 * 这是一个学生类，用来保存学生的基本信息
 */
public class Student{
	
	private String name;
	/**
	 *这是一个构造函数，用来构建学生对象
	 */
	public Student(){
	
	}
	/**
	 * 这是一个说hello的方法
	 */
	public void sayHello(){
		// 标准输出
		System.out.println("hello");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}