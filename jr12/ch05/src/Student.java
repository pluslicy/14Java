package com.briup.ch05;
/**
	ѧ���࣬�������ͣ�����ѧ�������ģ��
 */
public class Student {
	//1.˽������
	//��Ա���ԣ�ʵ�����ԣ���������
	private long id;
	private String name;
	private int age;

	//4. �޲ι��캯��
	public Student(long id,String name,int age){
		System.out.println("���ù��캯��������");
		this.id = id;
		this.name = name;
		this.age = age;
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
	/**
	  ��дObject���е�toString����
	*/
	public String toString(){
		return "Student[ name:"+this.name
			+",age:"+this.age+",id:"+this.id+"]";
	}
}