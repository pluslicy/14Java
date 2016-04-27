package com.briup.ch15;

public class Bird extends Animal {
	private String type;
	public Bird(){
		super(null,0);
	}
	public Bird(String name,int age,String type){
		super(name,age);
		this.type = type;
	}
	public void move(){
		System.out.println(super.getName()+"ÕýÔÚ·É£¡");
	}

	public void setType(String type){
		this.type = type;
	}
	public String getType(){
		return this.type;
	}
}