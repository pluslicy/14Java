package com.briup.ch04;
/**
   ѧ���࣬��������ѧ������Ϣ
*/
public class Student {
	private long id;
	private String name;
	private double weight;
	
	//����setter getter
	public void setId(long id){
		this.id = id;
	}
	public long getId(){
		return this.id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName()	{
		return this.name;
	}
	public void setWeight(double weight){
		this.weight = weight;
	}
	public double getWeight(){
		return this.weight;
	}
	
}
