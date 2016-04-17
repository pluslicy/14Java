package com.briup.ch05;
/**
	学生类，数据类型，创建学生对象的模板
 */
public class Student {
	//1.私有属性
	//成员属性，实例属性，对象属性
	private long id;
	private String name;
	private int age;

	//4. 无参构造函数
	public Student(long id,String name,int age){
		System.out.println("调用构造函数。。。");
		this.id = id;
		this.name = name;
		this.age = age;
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
	/**
	  重写Object类中的toString方法
	*/
	public String toString(){
		return "Student[ name:"+this.name
			+",age:"+this.age+",id:"+this.id+"]";
	}
}