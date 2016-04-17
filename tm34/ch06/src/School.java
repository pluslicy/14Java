package com.briup.ch06;

/**
  学校类，是创建学校对象的模板，学校对象是用来保存学校信息的
*/
public class School {
	//1. 私有属性
	private long id;	
	private String name;
	private String address;
	private char gender;	//性别

	//4.构造函数
	public School(){
	
	}
	public School(long id,String name,
			String address,char gender){
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
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
	public void setAddress(String address){
		this.address = address;
	}
	public String getAddress(){
		return this.address;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return this.gender;
	}
	//3.重写父类toString方法， 返回对象的字符串描述
	public String toString(){
		return "School[id:"+this.id
					+",name:"+this.name
					+",address:"+this.address
					+",gender:"+this.gender+"]";	
	}
}