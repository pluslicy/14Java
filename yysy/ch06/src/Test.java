package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		//���潭������ѧ����Ϣ

		/**
		  ʵ��������
		  1.��School����ص��ڴ��С�
		  2.����School�ࣨģ�壩�ڶ��ڴ��п����ڴ�ռ�
		  3.jvm�Զ����е����Խ��г�ʼ��
		  4.���ù��캯����ɶ����ʼ��
		  5.�����ڴ��ж�����׵�ַ����
		*/
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("��������ѧ���ϲ�У����");
		sc1.setAddress("�����ϲ�...");
		System.out.println(sc1);

		School sc2 = new School(1002L,"������ͨ��ѧ","�����ϲ�...");
		System.out.println(sc2);
	}
}