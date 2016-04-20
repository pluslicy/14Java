package com.briup.ch13;

import java.util.Scanner;
/**
  ѧ����Ϣ����ϵͳ
  ÿ��ѧ����Ϣ���浽������
  ѧ�����󱣴浽������
*/
public class Sms {
	private Student[] stus;//���ڴ洢ѧ������Ϣ
	private int index;	//���ڼ�¼�������ܹ��м���ѧ��

	//���캯�����ڳ�ʼ�������зǾ�̬����
	public Sms(){
		stus = new Student[3];
		index = 0;
	}

	/**
	  ����
	  @param  ѧ������
	*/
	public void save(Student stu){
		//����ĳ��Ȳ����Ա���ѧ���ˣ��������չ
		if(index >= stus.length){
			Student[] demo = new Student[stus.length + 3];
			//���鿽����stus -> demo
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = stu;
	}

	/**
	  ��ѯ���е�ѧ��
	  stus= new Student[3];
	  {{1001,terry,12},{1002,terry,12},null}
	  {{1001,terry,12},{1002,terry,12}}
	  index = 1
	*/
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}

	/**
		ͨ��ѧ����id����ѧ������Ϣ
		 {{1001,terry,12},{1002,terry,12},null}
		 1002
	*/
	public Student queryById(long id){
		//��ȡ��id���������е�����
		int num = getIndexById(id);
		return num == -1?null:stus[num];
	}

	/**
		ͨ��id��ȡѧ��Ϊ��id��ѧ���������е�λ��
		 {{1001,terry,12},{1002,terry,12},null}
		id = 1002
		 1
	*/
	private int getIndexById(long id){
		int num = -1;//��ѧ���Ҳ���
		for(int i=0;i<index;i++){
			if(stus[i].getId() == id){
				num = i;
				break;
			}
		}
		return num;
	}
	/**
	    id  name   age
		101 terry   12
		102 jacky   12

		102 jacky  12

		�޸�ѧ����Ϣ
	*/
	public void update(Student newStu){
		for(int i=0;i<index;i++){
			if(newStu.getId() == stus[i].getId()){
				stus[i].setName(newStu.getName());
				stus[i].setAge(newStu.getAge());
			}
		}
	}
	/**
		ɾ��ѧ����Ϣ
	    id  name   age
	stus = {
		{101 terry   12},
		{103 tom   12},
		{104 tom   12},
		null,
	}
		102

		�޸�ѧ����Ϣ
	*/
	public void deleteById(long id){
		int num = getIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	
	public void menu(){
		System.out.println("********ѧ������ϵͳ********");
		System.out.println("*1. ��ѯ����ѧ����Ϣ");
		System.out.println("*2. ¼��ѧ����Ϣ");
		System.out.println("*3. ɾ��ѧ����Ϣ");
		System.out.println("*4. ��ѯ����ѧ����Ϣ");
		System.out.println("*5. �޸�ѧ����Ϣ");
		System.out.println("*exit. �˳�");
		System.out.println("*help. ����");
		System.out.println("****************************");
	}
	/**
		������
	*/
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�����빦�ܱ�ţ�");
			String option = sc.nextLine();
			//System.out.println("�����ˣ�"+option);
			switch(option){
				case "1":
					System.out.println("������ѧ������Ϣ��");
					Student[] arr = sms.queryAll();
					for(int i=0;i<arr.length;i++){
						System.out.println(arr[i]);
					}
					System.out.println("�ܼ� "+sms.index+" ��");
					break;
				case "2":
					while(true){
						System.out.println("������ѧ����Ϣ��id#name#age���������롾break��������һ��Ŀ¼");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//1001#terry#12
						String[] stuArr = stuStr.split("#");
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						Student stu = new Student(id,name,age);
						sms.save(stu);
						System.out.println("����ɹ���");
					}
					
					break;
				case "3":
					while(true){
						System.out.println("������Ҫɾ��ѧ����ѧ�Ż������롾break��������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;//������ǰѭ�����������˵�
						}
						//1001#terry#12
						long id = Long.parseLong(idStr);
						Student oldStu = sms.queryById(id);
						if(oldStu == null){
							System.out.println("��Ҫɾ����ѧ�������ڣ�");
							continue;
						}
						sms.deleteById(id);
						System.out.println("ɾ���ɹ���");
					}
					break;
				case "4":
					while(true){
						System.out.println("������ѧ�Ż������롾break��������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//1001#terry#12
						long id = Long.parseLong(idStr);
						Student stu = sms.queryById(id);
						System.out.println(stu==null?"sorry,not found!":stu);
					}
					break;
				case "5"://�޸�
					while(true){
						System.out.println("������Ҫ�޸�ѧ����ѧ�Ż������롾break��������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;//������ǰѭ�����������˵�
						}
						//1001#terry#12
						long id = Long.parseLong(idStr);
						Student oldStu = sms.queryById(id);
						if(oldStu == null){
							System.out.println("��Ҫ�޸ĵ�ѧ�������ڣ�");
							continue;
						}
						System.out.println("ԭ����ϢΪ��"+oldStu);
						System.out.println("��������Ϣ��name#age��");
						//��ȡ�û�������Ϣ�����ҽ����װΪ����
						String newStr = sc.nextLine();
						String[] newArr = newStr.split("#");
						String name = newArr[0];
						int age = Integer.parseInt(newArr[1]);

						Student newStu = new Student(id,name,age);
						//�����޸�ģ��ķ���������޸Ĺ���
						sms.update(newStu);
						System.out.println("�޸ĳɹ�");
					}
					break;
				case "exit":
					System.out.println("bye bye,��ӭ�ٴ�ʹ�ã�");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("���Ϸ����룡");

			}
		}
	}
}