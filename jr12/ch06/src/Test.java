package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		/**
		  1. ����أ���Teacher����ص��ڴ���
		  2. ����Teacher�ࣨģ�壩�ڶ��ڴ��п����ڴ�ռ�
		  3. jvm��Զ����е����Խ��г�ʼ����ʹ��Ĭ��ֵ����ʼ����
		  4. ִ�й��캯���еĴ�����ɿͻ���ʼ��
		  5. �����ڴ��иö�����ڴ��׵�ַ����
		*/
		Teacher tea1 = new Teacher();
		tea1.setId(1001L);
		tea1.setName("terry");
		tea1.setSalary(20000.0D);
		System.out.println(tea1);

		Teacher tea2 = new Teacher(1002L,"larry",30000.0D,'��');
		System.out.println(tea2);
	}
}