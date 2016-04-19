package com.briup.ch12;

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
					System.out.println("�ܼ� "+sms.index+" ��");
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
						System.out.println("��ӳɹ���");
					}
					break;
				case "3":
					while(true){
						System.out.println("������Ҫɾ��ѧ����id������break������һ��");

						String idStr = scanner.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���ת��Ϊlong
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("��Ҫɾ����ѧ�������ڣ�");
							continue;
						}
						sms.deleteById(id);
						System.out.println("ɾ���ɹ���");
					}
					break;
				case "4":
					while(true){
						System.out.println("��������Ҫ�޸�ѧ����id������break������һ��");
						String idStr = scanner.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���ת��Ϊlong
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("��Ҫ�޸ĵ�ѧ����Ϣ������");
							continue;
						}	
						System.out.println("ԭ����"+stu);
						System.out.println("�������޸ĺ����Ϣ��name#age��:");
						String stuStr = scanner.nextLine();
						
						String[] arr = stuStr.split("#");
						String name = arr[0];
						int age = Integer.parseInt(arr[1]);
						//��װ�û�������¶���Ķ���
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("�޸ĳɹ���");
						
					}
					break;
				case "5":
					while(true){
						System.out.println("������Ҫ��ѯѧ����id������break������һ��");

						String idStr = scanner.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���ת��Ϊlong
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						System.out.println(stu==null?"sorry not found!":stu);
					}
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
	/**
	//ɾ��
	{
		{1001,terry,12},
		{1003,larry,12},
		null
	}
	stus.length = 3;
	index = 3;
	num = 1
	for(int i=1;i<2;i++){
			stus[1] = stus[2];
	}
	stus[index-1] = null;
	*/
	public void deleteById(long id){
		//��ȡ��id������������
		int num = findIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	/**
		��ѯ
	{
		{1001,terry,12},
		{1002,larry,12},
		null
	}
		findById(1002);
	*/
	public Student findById(long id){
		//���÷���ͨ��id��ȡ��id�������������
		int num = findIndexById(id);
		return num==-1 ? null : stus[num];
	}
	/**
		ͨ��id���Ҹ�id�Ķ����������е�����
	*/
	private int findIndexById(long id){
		int num = -1;
		for(int i=0;i<index;i++){
			if(id == stus[i].getId()){
				num = i;
				break;
			}
		}

		return num;
	}
	//��ѯ����
	public Student[] findAll(){
		//���鿽������ stus = {{},{},null} ->stusDemo={{},{}}
		Student[] stusDemo = new Student[index];
		System.arraycopy(stus,0,stusDemo,0,index);
		return stusDemo;
	}
	//�޸� id,   -- name,age
	public void update(Student stu){
		for(int i=0;i<index;i++){
			if(stu.getId() == stus[i].getId()){
				stus[i].setName(stu.getName());
				stus[i].setAge(stu.getAge());
			}
		}
	}

}