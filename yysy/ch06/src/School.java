package com.briup.ch06;
/**
 ѧУ��
 ѧУ������������ѧУ����ģ�ѧУ��������������ѧУ����Ϣ
 javase
 */
public class School {
	//1.˽������
	private long id;//0
	private String name;//null
	private String address;//null
	//4.���캯��
	public School(){
	
	}
	public School(long id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//2.����setter,getter����
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
	//3.��дtoString()����
	public String toString(){
		return "School[id:"+this.id+",name:"+this.name+",address:"+this.address+"]";
	}
}