package com.briup.ch05;

/**
	学生类
	类是创建对象的模板
	对象是保存信息的集合
 */
public class Student {
	//1.私有属性
	private long id;
	private String name;
	private int age;

	//3.构造函数
	public Student(long id,String name,int age){
		System.out.println("构造函数的调用。。");
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//2.公共的setter,getter方法
	public void setId(long id){
		//将参数id赋给当前对象中的id
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
	//4. 重写父类中的toString()方法
	public String toString(){
		return "Student[ id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}