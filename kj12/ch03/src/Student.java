package com.briup.ch03;
/**
 * ����һ��ѧ���࣬��������ѧ���Ļ�����Ϣ
 */
public class Student{
	
	private String name;
	/**
	 *����һ�����캯������������ѧ������
	 */
	public Student(){
	
	}
	/**
	 * ����һ��˵hello�ķ���
	 */
	public void sayHello(){
		// ��׼���
		System.out.println("hello");
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+"="+i*j+" ");
			}
			System.out.println();
		}
	}
}