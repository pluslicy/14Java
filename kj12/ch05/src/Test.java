package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		int a = 12;
		//�����ʵ��������������
		/**
			1. ����Student��
			2. ����Student���ڶ��ڴ��п����ڴ�ռ�
			3. JVM�������е����Գ�ʼ��
			4. ���ù��캯����ɿͻ���ʼ��
			5. �����ڴ��׵�ַ���ظ�stu1
		*/
		Student stu1 = new Student(1001,"����",22);
		System.out.println(stu1);

		Student stu2 = new Student();
		//���ʶ�������Ժͷ���   .
		stu2.setId(1002);
		stu2.setName("����");
		stu2.setAge(23);
		System.out.println(stu2);
	
		/*

		Student stu2 = new Student();
		//���ʶ�������Ժͷ���   .
		stu2.setId(10002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);

	/*
		System.out.println("id:"+stu1.getId());
		System.out.println("name:"+stu1.getName());
		System.out.println("age:"+stu1.getAge());
		System.out.println(stu2);
		System.out.println("id:"+stu2.getId());
		System.out.println("name:"+stu2.getName());
		System.out.println("age:"+stu2.getAge());

	*/
	}
}