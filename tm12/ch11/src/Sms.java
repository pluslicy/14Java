package com.briup.ch11;

import java.util.Scanner;
/**
	ѧ����Ϣ����ϵͳ
	����ѧ����Ϣ�ģ���ɾ�Ĳ飩
	����ѧ����Ϣ���浽���	ѧ������
	���е�ѧ����Ϣ���浽���	������
*/
public class Sms{
	private Student[] stus;

	/**
	 * ���ѧ����Ϣ
	 */
	public void save(Student student){
	
	}

    /**
	 *�޸�ѧ����Ϣ
	 */
	public Student update(Student student){
	
		return null;
	}

	/**
	 *ɾ��ѧ����Ϣ
	 */
    public void deleteById(int id){
	
	}

	/**
	 *��ѯ����ѧ����Ϣ
	 */
	public Student[] queryAll(){

		return null;
	}

	/**
	 *ͨ��id����ѧ����Ϣ
	 */
	public Student queryByName(long id){
		return null;
	}

	/**
	 * �˵�
  	 */
	public void menu(){
		System.out.println("********ѧ����Ϣ����ϵͳ********");
		System.out.println("*1 ��ѯ����ѧ����Ϣ");
		System.out.println("*2 ͨ��id����ѧ����Ϣ");
		System.out.println("*3 �޸�ѧ����Ϣ");
		System.out.println("*4 ¼��ѧ����Ϣ");
		System.out.println("*5 ɾ��ѧ����Ϣ");
		System.out.println("*exit �˳�ϵͳ��");
		System.out.println("********************************");
		System.out.println("*�������Ӧָ��");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		
	}
}