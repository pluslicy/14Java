package com.briup.ch07;

public class Test{
	public static void main(String[] args){
		//����ѧУ��Ϣ
		/**
		  1.����أ���School����ص��ڴ���
		  2.����School�ࣨģ�壩�ڶ��ڴ��п��ٿռ�
		  3.jvm��Զ����еı�����id,name,address�����г�ʼ����Ĭ��ֵ��
		  4.���ù��캯����ɹ˿ͳ�ʼ��
		  5.���ö������ڵ��ڴ��׵�ַ���ظ�����
		*/
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("������");
		sc1.setAddress("�����ϲ�");
		System.out.println(sc1);

		School sc2 = new School(1002L,"��������","�����ϲ�");
		System.out.println(sc2);
	}
}