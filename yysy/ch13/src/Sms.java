package com.briup.ch13;

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
	  @author zhangsan
	  @param Ҫ��ӵ�ѧ��
	*/
	public void save(Student stu){
		//��ѧ���ĸ������������������ɵķ�Χ��ʱ����Ҫ�����������չ
		if(index >= stus.length){
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = stu;
	}
	/**
	  ��ѯ����ѧ��
	  @author  lisi
	  @return ��������ѧ��������
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
	  ͨ��id��ѯѧ��
	  @author wangwu
	  @param id
	  @return
		null	û�ҵ�
		stu		��ѯ����ѧ��
	*/
	public Student findById(long id){
		//1,ͨ��id��λ��
		int num = findIndexById(id);
		//2,�Ѹ�λ���ϵĶ��󷵻�
		return num==-1?null:stus[num];
	}
	/**
	  ͨ��id��������
	  @author licy
	  @param id
	  @return 
		-1		�Ҳ���
		������	��ѧ���������е�λ��
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
	  ͨ��idɾ��ѧ��
	  @author zhaoliu
	  @param id

	  stus = {
		{1001,terry,12},
		{1003,terry,12},
		{1004,terry,12},
		null,
		null,
		null
	  }
	  index = 3;
	  id = 1002
	  num = 1
	  stus[1] = stus[1+1]
	  stus[2] = stus[2+1]

	*/
	public void deleteById(long id){
		int num = findIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	/**
	  ����ѧ����Ϣ,id�����޸�
	  @author guoqi
	  @paran ѧ������
	  1001:terry:12
	  1001:TERRY:13
	*/
	public void update(Student newStu){
		for(int i=0;i<index;i++){
			if(stus[i].getId() == newStu.getId()){
				stus[i].setName(newStu.getName());
				stus[i].setAge(newStu.getAge());
			}
		}
	}

	/**
		�˵�
		@auhor
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
						String[] stuArr = stuStr.split("#");
						//���û���������д���
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//��װ����
						Student stu = new Student(id,name,age);
						//���ñ��淽��
						sms.save(stu);
						System.out.println("¼��ɹ���");
						
					}
					break;
				}
				case "3":{//ɾ��ѧ����Ϣ
					while(true){
						System.out.println("������Ҫɾ��ѧ���ġ�id���������롾break��������Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���idת��Ϊ������
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("��ѧ�������ڣ�");
							continue;
						}
						sms.deleteById(id);
						System.out.println("ɾ���ɹ���");
					}

					break;
				}
				case "4":{//�鿴ѧ����Ϣ
					while(true){
						System.out.println("������Ҫ����ѧ���ġ�id���������롾break��������Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���idת��Ϊ������
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("��ѧ�������ڣ�");
							continue;
						}
						System.out.println(stu);
					}
					break;
				}
				case "5":{
					while(true){
						System.out.println("������Ҫ�޸�ѧ���ġ�id���������롾break��������Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//���ַ���idת��Ϊ������
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("��Ҫ�޸ĵ�ѧ����Ϣ�����ڣ�");
							continue;
						}

						System.out.println("��Ҫ�޸ĵ�ѧ����ϢΪ��"+stu);
						System.out.println("�������ѧ��������Ϣ��name#age��");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("�޸ĳɹ�");
					}
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