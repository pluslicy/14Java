package com.briup.ch05;

/**
  �����࣬main���������������
 */
public class Test {
	public static void main(String[] args){
		test2();
	}
	public static void test2(){
		Student stu1 = new Student(1001,"terry",12);	//ѧ�������ʵ��������������
		System.out.println(stu1);

		Student stu2 = new Student();	//ѧ�������ʵ��������������
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);
		System.out.println(stu2);
	}
	public static void test1(){
		 //ѧ�����ͱ���������
		/**
		  1. ��Student����ص��ڴ�
		  2. �����࿪���ڴ�ռ䣬����ѧ���������Ϣ
		  3. ϵͳ�������е�����ֵ���г�ʼ��
		  4. ���ù��캯����ɿͻ��Զ����ʼ��
		  5. ���ö�����ڴ��ַ����
		*/
		int a = 3;
		Student stu1 = new Student();	//ѧ�������ʵ��������������
		stu1.setId(1001);
		stu1.setName("terry");
		stu1.setAge(12);

		System.out.println(stu1);
		System.out.println("stu1 id:"+stu1.getId());
		System.out.println("stu1 name:"+stu1.getName());
		System.out.println("stu1 age:"+stu1.getAge());

		Student stu2 = new Student();	//ѧ�������ʵ��������������
		stu2.setId(1002);
		stu2.setName("larry");
		stu2.setAge(13);

		System.out.println(stu2);
		System.out.println("stu2 id:"+stu2.getId());
		System.out.println("stu2 name:"+stu2.getName());
		System.out.println("stu2 age:"+stu2.getAge());
	}
}

