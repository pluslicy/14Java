package com.briup.ch14;

public class Dog extends Animal {
	private String color;

	public Dog(){
		super(null,0);
		System.out.println("dog constructor");
	}
	public Dog(String name,int age,String color){
		super(name,age);
		this.color = color;
		System.out.println("dog �вι��캯��...");
	}
	//��д�����move����
	public void move(){
		System.out.println(super.getName()+"���ڱ��ܣ�");
	}
	//���еķ���
	public void kanmen(){
		System.out.println(super.getName()+"���ڿ��ţ�");
	}
	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
	public String toString(){
		return "Dog [name:"+super.getName()+",age:"+super.getAge()+",color:"+this.color+"]";
	}
}