package com.briup.ch06;

/**
  ѧУ�࣬�Ǵ���ѧУ�����ģ�壬ѧУ��������������ѧУ��Ϣ��
*/
public class School {
	//1. ˽������
	private long id;	
	private String name;
	private String address;
	private char gender;	//�Ա�

	//4.���캯��
	public School(){
	
	}
	public School(long id,String name,
			String address,char gender){
		this.id = id;
		this.name = name;
		this.address = address;
		this.gender = gender;
	}
	//2. ������setter,getter����
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
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return this.gender;
	}
	//3.��д����toString������ ���ض�����ַ�������
	public String toString(){
		return "School[id:"+this.id
					+",name:"+this.name
					+",address:"+this.address
					+",gender:"+this.gender+"]";	
	}
}