package com.briup.ch06;

public class Test {
	int a;
	char c;

	public static void main(String[] args){
		Test test = new Test();
		test.test8();
	}

	//���Զ�·
	public void test8(){
		System.out.println( aa() && bb() );
	}
	public boolean aa(){
		System.out.println("--a--");
		return false;
	}
	public boolean bb(){
		System.out.println("--b--");
		return true;
	}


	public void test7(){
		School sc1 = new School(1001,"������","�ϲ�","18812221111");
		School sc2 = new School(1001,"������","�ϲ�","18812221111");
		School sc3 = sc1;
		System.out.println(sc1 == sc3);

	}
	/**
	   ������
	*/
	public void test6(){
		char a = 'A';
		double b = 65;
		boolean c = true;
		boolean d = false;
		boolean result = (a > b);
		System.out.println(result);
		/*
		double a = 15.0;
		int b = 7;
		System.out.println(a % b);
		*/
	}
	public void test5(){
		System.out.println(c);
		char c2 = '\u0000';
		System.out.println(c2);

	}
	public void test4(){
		int a = 3;
		if(true){
			int b = 4;
			System.out.println(a);
			System.out.println(b);
		}
	}
	public void test3(){
		System.out.println(a);
	}
	//ʵ�����������󷽷�
	public void test2(){
		int b =1;//�ֲ�����
		System.out.println(a);
		System.out.println(b);
	
	}

	public void test1(){
		/**
			1. ����School�ൽ�ڴ���
			2. ����School�ࣨģ�壩���ڴ��п��ٿռ�
			3. jvm������Եĳ�ʼ��
			4. ���ù��캯����ɶ���ĳ�ʼ����
		*/
		School sc1 = new School(1001,"������","�ϲ�","18812221111");
		System.out.println(sc1);

		School sc2 = new School(1002,"��������","�ϲ�","18812221111");
		System.out.println(sc2);
	}
}