package com.briup.ch06;

/**
  JavaBean类
  学校类是创建学校对象的模板，学校对象是用来存储学校信息的
 */
public class School {
	//1. 私有属性
	private long id;
	private String name;
	private String address;
	//4. 构造函数
	public School(){
		System.out.println("调用无参构造函数....");
	}
	public School(long id,String name,String address){
		System.out.println("调用有参构造函数....");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//2. setter,getter方法
	public void setId(long id){
		//将参数id赋给当前对象的id属性
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
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	//3. 重写Object的toString方法
	public String toString(){
		return "School[ id:"+this.id
				+",name:"+this.name+",address:"
				+this.address+"]";
	}
}