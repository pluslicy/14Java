package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		System.out.println("����Dog���޲ι��캯��");	
	}
	public Dog(String name,int age,String color){
		this();
		super.setName(name);
		super.setAge(age);
		this.color = color;
		System.out.println("����Dog���вι��캯��");
	}
	/**
	  ��д�ƶ�����
	*/
	public void move(){
		System.out.println(super.getName()+"���ڱ���~~~");
	}
	//
	public void kanmen(){
		System.out.println(super.getName()+"���ڿ���~~~");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return "Dog [name"+super.getName()+",age:"
				+super.getAge()+",color:"+this.color+"]";
	}
}	