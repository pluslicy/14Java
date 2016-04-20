package com.briup.ch13;

import java.util.Scanner;
/**
	ѧ����Ϣ����ϵͳ
	����ѧ����Ϣ�ģ���ɾ�Ĳ飩
	����ѧ����Ϣ���浽���	ѧ������
	���е�ѧ����Ϣ���浽���	������
*/
public class Sms{
	private Student[] stus = new Student[3];//���ڱ���ѧ������
	private int index;	//��¼������ʵ��ѧ���ĸ���

	/**
	 * ���ѧ����Ϣ
	   save 
	     stus[0] = stu;  index = 1
		 stus[1] = stu;  index = 2
		 stus[2] = stu;	 index = 3
		 stus[3]
	 */
	public void save(Student student){
		if(index >= stus.length){
			//�������չ
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = student;
	}

    /**
	 *�޸�ѧ����Ϣ
	 stus = {
		1001 terry,
		1003 tom3,
		1004 tom4,
		1005 tom5,
		1006 tom6,
		null
	 }
		1006 terry
	 */
	public void update(Student student){
		for(int i=0;i<index;i++){
			if(student.getId() == stus[i].getId()){
				stus[i].setName(student.getName());
			}
		}
	}

	/**
	 *ɾ��ѧ����Ϣ
	 stus = new Student[6];
	 stus = {
		1001 terry,
		1003 tom3,
		1004 tom4,
		1005 tom5,
		1006 tom6,
		null
	 }
	 index = 6;
	 1002    num = 1;
	 for(int i=1;i<5;i++){
		stus[i] = stus[i+1]
		//stus[4] = stus[5]

	 }
	 */
    public void deleteById(long id){
		int num = getIndexById(id);
		for(int i=num ;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}

	/**
	 *��ѯ����ѧ����Ϣ
	 */
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}

	/**
	 *ͨ��id����ѧ����Ϣ

	 */
	public Student queryById(long id){
		int num = getIndexById(id);
		return num==-1?null:stus[num];
	}

	/**
	 ����ѧ�������id��ȡ��ѧ�������������е�����
	 stus = new Student[3];
	 1001 terry
	 1002 larry
	 null 

	 1003
	*/
	private int getIndexById(long id){
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
	 * �˵�
  	 */
	public void menu(){
		System.out.println("********ѧ����Ϣ����ϵͳ********");
		System.out.println("*1 ��ѯ����ѧ����Ϣ");
		System.out.println("*2 ¼��ѧ����Ϣ");
		System.out.println("*3 ɾ��ѧ����Ϣ");
		System.out.println("*4 ͨ��id����ѧ����Ϣ");
		System.out.println("*5 �޸�ѧ����Ϣ");
		System.out.println("*exit �˳�ϵͳ��");
		System.out.println("*help ��ȡ����");
		System.out.println("********************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//ɨ��������
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("*�������Ӧָ��:");
			String option = sc.nextLine();
			switch(option){
				case "1":	//��ѯ����
					System.out.println("����������ѧ������Ϣ��");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("�ܹ���ѯ��"+sms.index+"��ѧ��");
					break;
				case "2":	//¼��
					while(true){
						System.out.println("������ѧ������Ϣ��id#name#age�������롾break��������һ��Ŀ¼");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;//���ص���һ��Ŀ¼
						}
						//stuStr 1001#terry#12�ַ��� ->����->����
						String[] stuArr = stuStr.split("#");
						//�������и�Ԫ��ת��Ϊѧ����������Ҫ����������
						long id  = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//��װ����
						Student stu = new Student(id,name,age);
						sms.save(stu);
						System.out.println("����ɹ���");
					}
					break;
				case "3":	//ɾ��
					while(true){
						System.out.println("������Ҫɾ��ѧ����id,��������break������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						//��ѯҪɾ����ѧ����Ϣ�Ƿ����
						Student stu = sms.queryById(id);
						if(stu==null){
							System.out.println("��Ҫɾ�����û���Ϣ�����ڣ�");
							continue;
						}
						sms.deleteById(id);
						System.out.println("ɾ���ɹ���");
					}	
					break;
				case "4":	//ͨ��id��ȡ
					while(true){
						System.out.println("������Ҫ����ѧ����id,��������break������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.queryById(id);
						System.out.println(stu==null?"sorry,not found!":stu);
					}	
					break;
				case "5":	//�޸�
					while(true){
						System.out.println("������Ҫ�޸�ѧ����id,��������break������һ��Ŀ¼");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						//��ѯҪɾ����ѧ����Ϣ�Ƿ����
						Student stu = sms.queryById(id);
						if(stu==null){
							System.out.println("��Ҫ�޸ĵ��û���Ϣ�����ڣ�");
							continue;
						}
						System.out.println("ԭ��ϢΪ��"+stu);
						System.out.println("����������Ϣ��name#age����");
						// tom#12
						String str = sc.nextLine();
						String[] stuArr = str.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("�޸ĳɹ���");
					}	
					break;
				case "exit":
					System.out.println("bye bye,��ӭ�ٴ�ʹ�ã�");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("�������");

			}
		}
	}
}