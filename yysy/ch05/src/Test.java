package com.briup.ch05;

public class Test {
	public static void main(String[] args){
		/**
		ʵ����������Ĵ�����
			1.����أ� ��Student�ࣨģ�壩���ص��ڴ���
			2.����Student�ࣨģ�壩�ڶ��ڴ��п��ٿռ�
			3.jvm�������еı��������˳�ʼ����ʹ��Ĭ��ֵ��
			4.���ù��캯����ɹ˿ͳ�ʼ��
			5.��������ڴ��׵�ַ����
		 */
		Student stu1 = new Student();
		stu1.setId(1001L);
		stu1.setName("����");
		stu1.setGender("��");
		System.out.println(stu1);

		Student stu2 = new Student(1002L,"����","��");
		System.out.println(stu2);


	}
}