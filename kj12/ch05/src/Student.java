package com.briup.ch05;

/**
  JavaBean ��򵥵���
  ѧ���࣬�Ǵ���ѧ�������ģ�壬ѧ��������������ѧ������Ϣ

 */
public class Student {
	//1.˽�г�Ա���ԣ�ʵ�����ԣ���������
	private long id;
	private String name;
	private int age;
	//4.���캯��
	public Student(long id,String name,int age){
		System.out.println("���ù��캯����������");
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student(){
	
	}

	//2.������setter,getter����
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
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return this.age;
	}
	//3. ��д�����е�toString���������������ö���
	public String toString(){
		return "Student[ id:"+this.id
			+",name:"+this.name+",age:"
			+this.age+"]";
	}
}