package com.briup.ch15;

public class Dog extends Animal {
	private String color;

	public Dog(){
		//��ʽ����Animal���޲ι��캯��
		System.out.println("���ڵ���dog�Ĺ��캯��");
	}

	public void setColor(String color){
		this.color = color;
	}
	public String getColor(){
		return this.color;
	}
}