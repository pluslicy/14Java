package com.briup.ch05;
/**
   ѧ�����Ǵ���ѧ�������ģ�壬ѧ����������������ѧ����Ϣ��
   JavaBean
 */
public class Student {
	//1.˽������
	private long id;
	private String name;
	private String gender;
	//4.���캯��
	public Student(){
		System.out.println("���캯��������...");
	}
	public Student(long id,String name,String gender){
		this.id = id;
		this.name = name;
		this.gender = gender;
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
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getGender(){
		return this.gender;
	}
	//3. ��д������toString
	public String toString(){
		return "Student[ id:"+this.id
				+",name:"+this.name
				+",gender:"+this.gender
				+"]";
	}
}