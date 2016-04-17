package com.briup.ch05;

/**
  JavaBean 最简单的类
  学生类，是创建学生对象的模板，学生对象用来保存学生的信息

 */
public class Student {
	//1.私有成员属性，实例属性，对象属性
	private long id;
	private String name;
	private int age;
	//4.构造函数
	public Student(long id,String name,int age){
		System.out.println("调用构造函数。。。。");
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student(){
	
	}

	//2.公共的setter,getter方法
	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return this.name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	//3. 重写父类中的toString方法，用来描述该对象
	public String toString(){
		return "Student[ id:"+this.id
			+",name:"+this.name+",age:"
			+this.age+"]";
	}
}