package com.briup.ch12;

import java.util.Scanner;
/**
	ѧ����Ϣ����ϵͳ
*/
public class Sms {
	//ѧ�����飬���ڱ�������ѧ����Ϣ
	private Student[] stus = new Student[3];
	//��ʾѧ����������������ѧ���ĸ���
	private int index = 0;
	//�˵�
	public void menu(){
		System.out.println("*********ѧ����Ϣ����ϵͳ*********");
		System.out.println("* 1. �鿴����ѧ����Ϣ");
		System.out.println("* 2. ¼��ѧ����Ϣ");
		System.out.println("* 3. ɾ��ѧ����Ϣ");
		System.out.println("* 4. ����ѧ����Ϣ");
		System.out.println("* 5. ��ѯѧ����Ϣ");
		System.out.println("* help. ����");
		System.out.println("* exit. �˳�");
		System.out.println("**********************************");
	}		

	/**
		��������ѧ��
		stus = {
			{1001,terry,12},
			{1002,larry,13},
			null
		}
		demo={
			{1001,terry,12},
			{1002,larry,13}
		}
		index = 2
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}

	/**
		����ѧ��
		stus =	demo={
			{1001,terry,12},
			{1001,terry,12},
			{1001,terry,12},
			null,
			null,
			null
		}
		index = 3;
	 */
	public void add(Student stu){
		if(index>=stus.length){
			//������չ�� 6
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index] = stu;// stus[3] = stu
		index++;//3
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
		�޸�ѧ����Ϣ
	*/
	public Student update(Student stu){

		return null;
	}
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//ɨ���׼���룬�ȴ��û�������
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			//������ֱ���û�����س������س�ǰ�����û����뷵��
			String line = sc.nextLine();
			switch(line){
				case "1":
					System.out.println("����������ѧ������Ϣ��");
					Student[] arr = sms.findAll();
					for(Student stu : arr){
						System.out.println(stu);
					}
					System.out.println("���� "+sms.index+" ��");
					break;
				case "2":
					while(true){
						System.out.println("������ѧ����Ϣ��id#name#age���������롾break��������һ��");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//1001#terry#12
						String[] stuArr = stuStr.split("#");
						long id  = Long.parseLong(stuArr[0]);//"1001"
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("����ɹ���");
					}
					
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye!��ӭ�´��ٷ��ʣ�");
					System.exit(0);
				default:
					System.out.println("�������");
			}
		}
	}	
}