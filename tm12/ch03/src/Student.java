package com.briup.ch03;
/**
 * ѧ���࣬��������ѧ������Ϣ
 */
public class Student{
	// ����
	public String name;
	// ����
	private double weight;
	/**
	 * ѧ����Ĺ��캯�������ڳ�ʼ��һ������
	 */
	public Student(){
	
	}
	/**
	 * ˵��õķ���
	 */
	public void sayHello(){
		System.out.println(name+" ˵ hello");
	}
	/**
	 * ��������֮��ӷ�����ķ���
	 * @param ���� a
	 * @param ���� b
	 * @return �� 
	 */
	public int add(int a,int b){
		return a+b;
	}
}