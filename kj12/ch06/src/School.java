package com.briup.ch06;

/**
	JavaBean
	ѧУ���Ǵ���ѧУ�����ģ�壬ѧУ��������������ѧУ����Ϣ

  */
public class School{
	//˽������
	private long id;
	private String name;
	private String address;
	private String telephone;
	//���캯��
	public School(long id,String name,String address,String telephone){
		this.id = id;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}
	//������setter,getter����
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
	//��д�����toString����
	public String toString(){
		return "School [id:"+this.id+",name:"+this.name+",address:"+this.address+",telephone:"+this.telephone+"]";
	}
}