package com.briup.ch12;

import java.util.Scanner;

public class Sms {
	//ѧ�����飬������������ѧ������Ϣ��
	private Student[] stus = new Student[3];
	private int index = 0; //ѧ���ĸ���
	//���ѧ��
	public void add(Student stu){
		//��������е�Ԫ�صĸ������ڵ������鳤�ȵ�ʱ��˵�����鳤�Ȳ���
		if(index>=stus.length){
			//������չ
			Student[] demo = new Student[stus.length+3];
			//����Ŀ���
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;// stus[index] = stu; index++;
	}
	/**
	stus = {
		{1001,terry},
		{1002,larry},	
		{1003,tom},
		null,
		null
	
	}
	// 1002  stuIndex = 1; index = 3
	for(int i=1;i<2;i++){
		//stus[0] = stus[1]
		//stus[1] = stus[2]
		stus[2] = stus[3]
	}
	index = 3

	{1,2,4,5,6,7,8,9,0}
	*/
	//ͨ��idɾ��ѧ�� 1002  1T  "HELLO WORLD"
	public void deleteById(long id){
		//���÷�����ȡidΪָ�����������������е�λ��
		int stuIndex = queryIndexById(id); // 1
		if(stuIndex!=-1){
			for(int i=stuIndex;i<index-1;i++){
				stus[i] = stus[i+1];
			}
			stus[--index] = null;
		}
	}
	
	//ͨ��id���Ҹ�ѧ�����ڵ�λ�� 1002
	private int queryIndexById(long id){
		int stuIndex= -1;
		for(int i=0;i<index;i++){
			if(stus[i].getId() == id){
				stuIndex = i;
				break;
			}
		}
		return stuIndex;
	}
	//ͨ��id��ѯѧ�� ddl  dml
	public Student queryById(long id){
		//���÷�����ȡidΪָ�����������������е�λ��
		int stuIndex = queryIndexById(id);
		return stuIndex==-1?null:stus[stuIndex];
	}

	//�鿴����ѧ����Ϣ
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
	{
	{1001,terry,12},
	{1002,larry,13},
	null
	}
	1002
	{1002,larry,13}
	�����롣������[name,age]
	tom#14

	{1002,tom,14}
	*/  
	public void update(Student stu){
		for(int i=0;i<index;i++){
			if(stu.getId() == stus[i].getId()){
				stus[i].setName(stu.getName());
				stus[i].setAge(stu.getAge());
			}
		}
	}
	//�˵�
	public void menu(){
		System.out.println("********ѧ������ϵͳ*******");
		System.out.println("*1���鿴����ѧ����Ϣ*");
		System.out.println("*2�����ѧ����Ϣ*");
		System.out.println("*3��ɾ��ѧ����Ϣ*");
		System.out.println("*4����ѯѧ����Ϣ*");
		System.out.println("*5���޸�ѧ����Ϣ*");
		System.out.println("*exit���˳�*");
		System.out.println("*help������*");
		System.out.println("***************************");
	}

	public static void main(String[] args){
		//����sms����
		Sms sms = new Sms();
		sms.menu();	//��ʾ��ҳ��
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			//�ȴ��û����빦�ܱ�ţ����û�����س���ʱ���ȡ�س�ǰ���������
			String option = scanner.nextLine();
			switch(option){
				case "1"://��ѯ����
					System.out.println("����������ѧ������Ϣ��");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("�ܼƣ�"+stus.length+" ��");
					break;
				case "2"://���
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
						//�жϸ��û�id�Ƿ��Ѿ�����ռ��
						Student dbStu = sms.queryById(id);
						if(dbStu!=null){
							System.out.println("��id�Ѿ�����ռ�ã�������¼�룡");
							continue;
						}

						sms.add(stu);
						System.out.println("��ӳɹ���");
					}
					
					break;
				case "3"://ɾ��
					while(true){
						System.out.print("��������Ҫɾ��ѧ����id��break������һ��Ŀ¼:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						sms.deleteById(Long.parseLong(id));
						System.out.println("ɾ���ɹ���ѧ������Ϊ��"+sms.index);
					}
					break;
				case "4"://��ѯ
					while(true){
						System.out.print("��������Ҫ��ѯѧ����id��break������һ��Ŀ¼:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						Student stu = sms.queryById(Long.parseLong(id));
						System.out.println("��������Ҫ���ҵ�ѧ������Ϣ��");
						System.out.println(stu!=null?stu:"not found!");
					}
					break;
				case "5"://�޸�
					while(true){
						System.out.print("��������Ҫ�޸�ѧ����id��break������һ��Ŀ¼:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						Student stu = sms.queryById(Long.parseLong(id));
						if(stu == null){
							System.out.println("��ѧ�������ڣ�");
							continue;
						}
						System.out.println("ԭ��ϢΪ��"+stu);
						System.out.println("��������Ҫ�޸ĵ���Ϣ��name#age��");
						String stuStr = scanner.nextLine();
						String[] stuArr = stuStr.split("#");

						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);

						Student newStu = new Student(Long.parseLong(id),name,age);

						sms.update(newStu);
						System.out.println("�޸ĳɹ���");
					}
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