package com.briup.ch06;

/**
	最简单的类JavaBean
	学校类是创建学校对象的模板，学校对象是用来保存学校信息
 */
public class School {
	//1.私有属性
	private long id;
	private String name;
	private String address;
	//3.构造函数
	public School(){
	
	}
	public School(long id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	//2.公共的setter,getter方法 用于为私有属性设置值，取值
	public void setId(long id){
		//将id代表的值赋给本对象中的id属性
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

	//4.重写父类的toString()方法
	public String toString(){
		return "School [ id "+this.id+",name:"+this.name+",address:"+this.address+"]";
	}
}