package com.briup.ch06;
/**
 学校类
 学校类是用来构建学校对象的，学校对象是用来保存学校的信息
 javase
 */
public class School {
	//1.私有属性
	private long id;//0
	private String name;//null
	private String address;//null
	//4.构造函数
	public School(){
	
	}
	public School(long id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//2.公共setter,getter方法
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
	//3.重写toString()方法
	public String toString(){
		return "School[id:"+this.id+",name:"+this.name+",address:"+this.address+"]";
	}
}