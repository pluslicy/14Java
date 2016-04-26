package com.briup.ch15;

public class Bird extends Animal {
	private String type;
	public Bird(String name,int age,String type){
		super(name,age);
		this.type = type;
	}
	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
	//重写父类的move方法
	public void move(){
		System.out.println(super.getName()+"在飞");
	}
	//鸟类特有的方法
	public void speak(){
		System.out.println(super.getName()+"在说话！");
	}
}