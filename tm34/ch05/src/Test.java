package com.briup.ch05;

/**
  ������
 */
public class Test{
	public static void main(String[] args){
		//����ľ3������ѧ������Ϣ���浽������
		/*
		  1. ��Student����ص������С�
		  2. ����Student�ࣨģ�壩�����ڴ�ռ䣬����ѧ������
		  3. jvm�Զ����е����Խ��г�ʼ����
		        char		 
			    �з�������   0
				�з���С��   0.0
				��������     false
				������������ null
		  4. ���ù��캯����ɶ���ĳ�ʼ��
		  5. ���ö������ڴ��е��׵�ַ���з���
		*/
		Student stu1 = new Student(1001,"terry",12);
		System.out.println(stu1);
		Student stu2 = new Student(1002,"larry",13);
		System.out.println(stu2);

		/*
		System.out.println("stu1 id:"+stu1.getId());
		System.out.println("stu1 name:"+stu1.getName());
		System.out.println("stu1 age:"+stu1.getAge());

		Student stu2 = new Student();
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);
		System.out.println("stu2 id:"+stu2.getId());
		System.out.println("stu2 name:"+stu2.getName());
		System.out.println("stu2 age:"+stu2.getAge());

		*/
	}
}