package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		//��ʽ����Animal���޲ι��캯��
		super(null,0);
		System.out.println("���ڵ���dog�Ĺ��캯��");
	}
	public Dog(String name,int age,String color){
		super(name,age);
		this.color = color;
	}
	public void move(){
		System.out.println(super.getName()+"���ڱ���");
	}
	public void kanmen(){
		System.out.println(super.getName()+"���ڿ���");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}

	public String toString(){
		return "[Dog name:"+super.getName()+",age:"+super.getAge()+",color:"+this.color+"]";
	}
}