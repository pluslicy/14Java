package com.briup.ch06;

/**
	JavaBean
	学校类是创建学校对象的模板，学校对象是用来保存学校的信息

  */
public class School{
	//私有属性
	private long id;
	private String name;
	private String address;
	private String telephone;
	//构造函数
	public School(long id,String name,String address,String telephone){
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	//公共的setter,getter方法
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
	public void setTelephone(String telephone){
		this.telephone = telephone;
	}
	public String getTelephone(){
		return this.telephone;
	}
	//重写父类的toString方法
	public String toString(){
		return "School [id:"+this.id+",name:"+this.name+",address:"+this.address+",telephone:"+this.telephone+"]";
	}
}