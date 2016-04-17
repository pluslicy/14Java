package com.briup.ch11;

import java.util.Scanner;

public class Sms {
	//ѧ�����飬������������ѧ������Ϣ��
	private Student[] stus = new Student[3];
	private int index = 0; //ѧ���ĸ���
	//���ѧ��
	public void add(Student stu){
		//������չ
		if(index>=stus.length){
			Student[] demo = new Student[stus.length+3];
			// stus -> demo
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;
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
		Student[] demo = new Student[index];
		//stus -> demo
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	//�˵�
	public void menu(){
		System.out.println("********ѧ������ϵͳ*******");
		System.out.println("*1���鿴����ѧ����Ϣ*");
		System.out.println("*2�����ѧ����Ϣ*");
		System.out.println("*3��ɾ��ѧ����Ϣ*");
		System.out.println("*4����ѯѧ����Ϣ*");
		System.out.println("*exit���˳�*");
		System.out.println("*help������*");
		System.out.println("***************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			String option = scanner.nextLine();
			switch(option){
				case "1":
					System.out.println("����������ѧ������Ϣ��");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("�ܼƣ�"+stus.length+" ��");
					break;
				case "2":
					while(true){
						System.out.println("������ѧ����Ϣ��id#name#age����������break�ص���һ��Ŀ¼");
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						String[] stuArr = stuStr.split("#");
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//��װ����
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("��ӳɹ���");
					}
					
					break;
				case "3":
					break;
				case "4":
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye");
					System.exit(0);
				default:
					System.out.println("����������������룡");
			}
		}
			
	}
}