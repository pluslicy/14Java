package com.briup.ch05;

/**
	ѧ����
	���Ǵ��������ģ��
	�����Ǳ�����Ϣ�ļ���
 */
public class Student {
	//1.˽������
	private long id;
	private String name;
	private int age;

	//3.���캯��
	public Student(long id,String name,int age){
		System.out.println("���캯���ĵ��á���");
		this.id = id;
		this.name = name;
		this.age = age;
	}
	//2.������setter,getter����
	public void setId(long id){
		//������id������ǰ�����е�id
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
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	//4. ��д�����е�toString()����
	public String toString(){
		return "Student[ id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
	}
}