package com.briup.ch10;
/**
   ѧ�����Ǵ���ѧ�������ģ�壬
   ѧ����������������ѧ����Ϣ��
   JavaBean
 */
public class Student {
	//1.˽������
	private long id;
	private String name;
	private int age;
	//4.���캯��
	public Student(){
		System.out.println("���캯��������...");
	}
	public Student(long id,String name,int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}

	//2.�ṩ������setter�����ã���getter����ȡ������
	public void setId(long id){
		//������id�����������е�id
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
	//3. ��д������toString
	public String toString(){
		return "Student[ id:"+this.id
				+",name:"+this.name
				+",age:"+this.age
				+"]";
	}
}