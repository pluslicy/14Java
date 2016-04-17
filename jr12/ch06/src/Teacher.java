package com.briup.ch06;

/**
	JavaBean类
	教师类是用来创建教师对象的模板，教师对象是用来保存教师信息的
 */
public class Teacher {
	//1. 私有属性
	private long id;
	private String name;
	private double salary;
	private char gender;	//性别

	//4. 构造函数
	public Teacher(){
		this.gender = '男';
	}
	public Teacher(long id,String name,double salary,char gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
	}

	//2. 公共的setter,getter方法
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
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return this.gender;
	}
	/**
	  3. 重写父类中的toString方法
	  返回对象的字符串描述
	*/
	public String toString(){
		return "Teacher{id:"+this.id
					+",name:"+this.name
					+",gender:"+this.gender
					+",salary:"+this.salary+"}";
	}
}