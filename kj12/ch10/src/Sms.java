package com.briup.ch10;

import java.util.*;

public class Sms {
	//ѧ�����飬������������ѧ������Ϣ��
	private Student[] stus;

	public static void main(String[] args){
		Sms sms = new Sms();
		
		while(true){
			sms.menu();
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			System.out.println(line);
		}
	}

	//�˵�
	public void menu(){
		System.out.println("********ѧ������ϵͳ*******");
		System.out.println("*1���鿴����ѧ����Ϣ*");
		System.out.println("*2�����ѧ����Ϣ*");
		System.out.println("*3��ɾ��ѧ����Ϣ*");
		System.out.println("*4����ѯѧ����Ϣ*");
		System.out.println("*exit���˳�*");
		System.out.println("***************************");


	}

	//���ѧ��
	public void add(Student stu){
	
	}

	//ͨ��idɾ��ѧ��
	public void deleteById(long id){
	
	}

	//ͨ��id��ѯѧ�� ddl  dml
	public Student queryById(long id){
		Student stu = null;

		return stu;
	}

	//�鿴����ѧ����Ϣ
	public Student[] queryAll(){
		
		return stus;
	}
}