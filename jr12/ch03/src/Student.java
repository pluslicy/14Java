package com.briup.ch03;
/**
 * ����һ��ѧ���࣬��������ѧ������Ϣ
 */
public class Student{
	/**
	 * �����id,Ψһ��ʶһ��ѧ��
	 */
	private long id;
	/**
	 * ���������
	 */
	private String name;
	/**
	 * ���������
	 */
	private int age;
	

	/**
	 * ����ӷ�����
	 */
	public int add(int a,int b){
		return a+b;
	}

	/**
	 * ���������Ϸ�ķ���
	 */
	public void playGame(String name){
		System.out.println("play "+name);
	}

}