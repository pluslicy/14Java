package com.briup.ch06;

/**
  JavaBean��
  ѧУ���Ǵ���ѧУ�����ģ�壬ѧУ�����������洢ѧУ��Ϣ��
 */
public class School {
	//1. ˽������
	private long id;
	private String name;
	private String address;
	//4. ���캯��
	public School(){
		System.out.println("�����޲ι��캯��....");
	}
	public School(long id,String name,String address){
		System.out.println("�����вι��캯��....");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//2. setter,getter����
	public void setId(long id){
		//������id������ǰ�����id����
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
	//3. ��дObject��toString����
	public String toString(){
		return "School[ id:"+this.id
				+",name:"+this.name+",address:"
				+this.address+"]";
	}
}