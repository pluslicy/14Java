package com.briup.ch03;

/**
 * �������ѧ���࣬��������ѧ������Ϣ
 */
public class Student {
	public String name;
	private double weight;
	/**
	 * ����ǹ��캯����������ʼ������
	 */
	public Student(){
	
	}
	/**
	 * ����˵��õķ���
	 */
	public void sayHello(){
		System.out.println(name+" ˵ hello");
	}
	/**
	 * ����һ���ӷ�����
	 */
	public int add(int a,int b){
		return a+b;
	}
	/**
	 * �ڲ���
	 */
	class Inner
	{
	}
}

/**
 *	����һ����ʦ��
 */
class Teacher {
	

}