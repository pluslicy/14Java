package com.briup.ch06;

/**
	��򵥵���JavaBean
	ѧУ���Ǵ���ѧУ�����ģ�壬ѧУ��������������ѧУ��Ϣ
 */
public class School {
	//1.˽������
	private long id;
	private String name;
	private String address;
	//3.���캯��
	public School(){
	
	}
	public School(long id,String name,String address){
		this.id = id;
		this.name = name;
		this.address = address;
	}

	//2.������setter,getter���� ����Ϊ˽����������ֵ��ȡֵ
	public void setId(long id){
		//��id�����ֵ�����������е�id����
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

	//4.��д�����toString()����
	public String toString(){
		return "School [ id "+this.id+",name:"+this.name+",address:"+this.address+"]";
	}
}