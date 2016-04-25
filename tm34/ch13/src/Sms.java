package com.briup.ch13;

import java.util.Scanner;
/**
	ѧ����Ϣ����ϵͳ
*/
public class Sms {
	//ѧ�����飬���ڱ�������ѧ����Ϣ
	private Student[] stus = new Student[3];
	//��ʾѧ����������������ѧ���ĸ���
	private int index = 0;
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
		���ѧ��
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
		index++;
	}

	/**
		ͨ��idɾ��ѧ�� 
		@author lisi
		@param ѧ��id
	*/
	public void deleteById(long id){
		int num = findIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	/**
		ͨ��id����ѧ��
		@author zhangsan
		@param Ҫɾ��ѧ����id  : long
		@return 
			ѧ�����ҵ���
			null�� û�ҵ�
	*/
	public Student findById(long id){
		int num = findIndexById(id);
		return num == -1?null:stus[num];
	}
	/**
		ͨ��id����ѧ���������е�����
		@author licy
		@param Ҫ����ѧ����id  : long
		@return 
			-1���ҵ���
			������������ û�ҵ�
	*/
	public int findIndexById(long id){
		int num = -1;
		for(int i=0;i<index;i++){
			if(stus[i].getId() == id){
				num = i;
				break;
			}
		}
		return num;
	}
	
	/**
		�޸�ѧ����Ϣ
	*/
	public void update(Student newStu){
		for(int i=0;i<index;i++){
			if(stus[i].getId() == newStu.getId()){
				stus[i].setName(newStu.getName());
				stus[i].setAge(newStu.getAge());
			}
		}
	}

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
					while(true){
						System.out.println("������Ҫɾ��ѧ����id����break������һ����");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("��Ҫɾ����ѧ�������ڣ�");
							continue;	//������ǰѭ����������һ��ѭ��
						}
						sms.deleteById(id);
						System.out.println("ɾ���ɹ���");
					}
					break;
				case "4":
					while(true){
						System.out.println("������Ҫ����ѧ����id����break������һ����");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("��Ҫ���ĵ�ѧ�������ڣ�");
							continue;	//������ǰѭ����������һ��ѭ��
						}
						System.out.println("ԭ��ѧ����ϢΪ��");
						System.out.println(stu);
						System.out.println("������Ҫ�޸ĵ���Ϣ��name#age��");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("�޸ĳɹ�");
					}
					break;
				case "5":
					while(true){
						System.out.println("������Ҫ��ѯѧ����id����break������һ����");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("��Ҫ��ѯ��ѧ�������ڣ�");
							continue;	//������ǰѭ����������һ��ѭ��
						}
						System.out.println(stu);
					}
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