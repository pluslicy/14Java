package com.briup.ch10;
/**
   学生类是创建学生对象的模板，
   学生对象是用来保存学生信息的
   JavaBean
 */
public class Student {
	//1.私有属性
	private long id;
	private String name;
	private int age;
	//4.构造函数
	public Student(){
		System.out.println("构造函数被调用...");
	}
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//2.提供公共的setter（设置），getter（获取）方法
	public void setId(long id){
		//将参数id赋给本对象中的id
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
	//3. 重写父类中toString
	public String toString(){
		return "Student[ id:"+this.id
				+",name:"+this.name
				+",age:"+this.age
				+"]";
	}
}