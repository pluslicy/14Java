package com.briup.ch10;
//�������� 1 ͬ����2�� java.lang
import java.util.Scanner;
/**
	ѧ����Ϣ����ϵͳ
	���ѧ��
	�޸�ѧ����Ϣ
	ɾ��ѧ����Ϣ
	����ѧ����Ϣ
	��������ѧ����Ϣ
 */
public class Sms {
	//ѧ�����飬���ڱ�������ѧ����Ϣ
	private Student[] stus = new Student[3];
	//��ʾѧ����������������ѧ���ĸ���
	private int index = 0;
	/**
	  �˵���������ʾ��������
	*/
	public void menu(){
		System.out.println("********ѧ����Ϣ����ϵͳ********");
		System.out.println("*1,���ѧ�� ");
		System.out.println("*2,�޸�ѧ����Ϣ ");
		System.out.println("*3,��������ѧ����Ϣ ");
		System.out.println("*4,ɾ��ѧ����Ϣ ");
		System.out.println("*5,����ѧ����Ϣ ");
		System.out.println("*exit,�˳�ϵͳ ");
		System.out.println("********************************");
		System.out.print("�����빦�ܱ�ţ�");
	}

	/**
		���ѧ��
	 */
	public void add(Student stu){
	 
	}
	/**
		ɾ��ѧ�� 
	*/
	public void deleteById(long id){
		
	}
	/**
		ͨ��id����ѧ��
	*/
	public Student findById(long id){

		return null;
	}
	/**
		��������ѧ��
	*/
	public Student[] findAll(){

		return null;
	}
	/**
		�޸�ѧ����Ϣ
	*/
	public Student update(Student stu){

		return null;
	}
	public static void main(String[] args){
		Sms sms = new Sms();
		//ɨ���׼���룬�ȴ��û�������
		Scanner scanner = new Scanner(System.in);
		while(true){
			//sms.menu();
			//������ֱ���û�����س������س�ǰ�����û����뷵��
			String line = scanner.nextLine();
			System.out.println("�����ˣ�"+line);
		}
	}	
}