package com.briup.ch12;

import java.util.Scanner;
/**
	ҵ����
	ѧ����Ϣ����ϵͳ
	����ѧ����Ϣ���浽ѧ������ѧ�����󱣴������飨���ܳ־û����棩
*/
public class Sms {
	private Student[] stus;	//�洢ѧ�����������
	private int index;		//��¼������ѧ���ĸ���

	public Sms(){
		this.stus = new Student[3];
		this.index = 0;
	}
	/**
		���ѧ����Ϣ
	*/
	public void save(Student stu){
		
	}
	/**
		��ѯ����ѧ��
		stus = {
			{1001,terry,12},
			{1002,larry,12},
			null
		}
		index = 2;
		git 5
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
		ͨ��id��ѯѧ��
	*/
	public Student findById(long id){
		return null;
	}
	/**
		ͨ��idɾ��ѧ��
	*/
	public void deleteById(long id){
		
	}
	/**
		����ѧ����Ϣ
	*/
	public void update(Student newStu){
	
	}

	/**
		�˵�
	*/
	public void menu(){
		System.out.println("***********ѧ����Ϣ����ϵͳ***********");
		System.out.println("*1. ��ѯ����ѧ����Ϣ");
		System.out.println("*2. ¼��ѧ����Ϣ");
		System.out.println("*3. ɾ��ѧ����Ϣ");
		System.out.println("*4. �鿴ѧ����Ϣ");
		System.out.println("*5. ����ѧ����Ϣ");
		System.out.println("*help. ����");
		System.out.println("*exit. �˳�");
		System.out.println("**************************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();	
		Scanner sc = new Scanner(System.in);
		sms.menu();
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			String option = sc.nextLine();
			switch(option){
				case "1":{//��ѯ����ѧ����Ϣ
					System.out.println("����������ѧ������Ϣ��");
					//���÷�����ѯ����ѧ����Ϣ
					Student[] arr = sms.findAll();
					//����
					for(Student stu : arr){
						System.out.println(stu);
					}
					System.out.println("�ܼ� "+sms.index+"��");
					break;
				}
				case "2":{//¼��ѧ����Ϣ
					while(true){
						System.out.println("������ѧ����Ϣ��id#name#age���������롾break���������˵�");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						System.out.println(stuStr);
					}
					break;
				}
				case "3":{

					break;
				}
				case "4":{

					break;
				}
				case "5":{

					break;
				}
				case "exit":{
					System.out.println("bye bye!��ӭ�ٴ�ʹ�ã�");
					System.exit(0);
				}
				case "help":{
					sms.menu();
					break;
				}
				default:
					System.out.println("��������");
			}
		}
	}
}