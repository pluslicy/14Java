package com.briup.ch06;

/**
	JavaBean��
	��ʦ��������������ʦ�����ģ�壬��ʦ���������������ʦ��Ϣ��
 */
public class Teacher {
	//1. ˽������
	private long id;
	private String name;
	private double salary;
	private char gender;	//�Ա�

	//4. ���캯��
	public Teacher(){
		this.gender = '��';
	}
	public Teacher(long id,String name,double salary,char gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.salary = salary;
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
	public void setSalary(double salary){
		this.salary = salary;
	}
	public double getSalary(){
		return this.salary;
	}
	public void setGender(char gender){
		this.gender = gender;
	}
	public char getGender(){
		return this.gender;
	}
	/**
	  3. ��д�����е�toString����
	  ���ض�����ַ�������
	*/
	public String toString(){
		return "Teacher{id:"+this.id
					+",name:"+this.name
					+",gender:"+this.gender
					+",salary:"+this.salary+"}";
	}
}