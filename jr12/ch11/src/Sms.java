package com.briup.ch11;

import java.util.Scanner;	//corejava + API

/**
 student manager system
 ѧ����Ϣ����ϵͳ
 1. CoreJava					JavaEE(��̨����)
	��̨����
								ǰ�˼���(������)
 2. html/css/js ǰ�˼���		Webui(ǰ�˼���(pc��))
 3. corejava/android/H5			Android(ǰ�˼���(�ƶ���))
 4.	c����,swift.../H5			IOS(ǰ�˼���(�ƶ���))
 html/GUI

*/
public class Sms{
	private Student[] stus = new Student[3];
	private int index = 0;	//������ѧ���ĸ���

	/**
	  �������
	*/
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//����ɨ��������
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			//��ر�׼���룬���û�����س����÷������Խ��س�֮ǰ���е��û����뷵��
			String option = scanner.nextLine();
			switch(option){
				case "1":	//��ѯ����ѧ����Ϣ
					System.out.println("����Ϊ����ѧ������Ϣ��");
					Student[] stus = sms.findAll();
					for(int i=0;i<stus.length;i++){
						System.out.println(stus[i]);
					}
					break;
				case "2":	//���ѧ����Ϣ
					while(true){
						System.out.println("������ѧ����Ϣ��id#name#age����������break������һ��Ŀ¼");
						//�����û�������
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//�ָ��ַ���
						String[] stuArr = stuStr.split("#");
						//���ַ���ת��Ϊint
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//��װ����
						Student stu = new Student(id,name,age);
						sms.save(stu);
					}
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "exit":
					System.out.println("��ӭ�ٴ�ʹ��ϵͳ");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("����������������롣");
			}
		}
	}
	//�˵�
	public void menu(){
		System.out.println("**********ѧ����Ϣ����ϵͳ**********");
		System.out.println("**1. ��ѯ����ѧ����Ϣ");
		System.out.println("**2. ���ѧ����Ϣ");
		System.out.println("**3. ɾ��ѧ����Ϣ");
		System.out.println("**4. �޸�ѧ����Ϣ");
		System.out.println("**5. ����ѧ�Ų�ѯѧ����Ϣ");
		System.out.println("**exit. �˳�ϵͳ");
		System.out.println("**help. ����");
		System.out.println("************************************");
	}
	
	//����ѧ����Ϣ
	public void save(Student stu){
		//index ������ѧ������ 3  stus.length ���鳤�� 3
		if(index>=stus.length){
			//������չ
			Student[] demo = new Student[stus.length+5];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = stu;
	
	}
	//ɾ����Ϣ
	public void deleteById(long id){
	
	}
	//��ѯ
	public Student findById(long id){
		return null;
	}
	//��ѯ����
	public Student[] findAll(){
		//���鿽������ stus = {{},{},null} ->stusDemo={{},{}}
		Student[] stusDemo = new Student[index];
		System.arraycopy(stus,0,stusDemo,0,index);
		return stusDemo;
	}
	//�޸�
	public Student update(Student stu){

		return null;
	}

}