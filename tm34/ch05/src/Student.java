package com.briup.ch05;
/**
	JavaBean
	java.lang.*
	学生类
	创建学生对象的模板。对象是用来从存储学生的信息
 */
public class Student {
	//1. 私有属性
	private long id;
	private String name;
	private int age;
	//4. 构造函数
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}



	//2. 提供公共的setter,getter方法
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

	/**
		重写父类中的toString()
		当学生对象调用该方法的时候不再去体现父类的特点
	 */
	public String toString(){
		return "Student [ id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
	

}