package com.briup.ch07;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test7();
	}
	//λ����
	public void test7(){
	   int a = 1;	//0000 0001
       int b = 3;	//0000 0011
       int result = a|b;
	   System.out.println("result:"+result);
	}
	//������Ŀ�����
	public void test6(){
		System.out.println(max(41,10));
	}
	public int max(int a,int b){
		//return a>b?a:b;
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
	//�����߼������
	public void test5(){
		boolean result = bb() && aa();
		System.out.println("result:"+result);
	}
	public boolean aa(){
		System.out.println("---aa---");
		return true;
	}
	public boolean bb(){
		System.out.println("---bb---");
		return false;
	}
	//���ԱȽ������
	public void test4(){
		//int a = 4;
		//float b = 4.0F;
		Test a = new Test();
		Test b = new Test();
		Test c = a;
		boolean result = a == c;
		System.out.println("result:"+result);
	}
	//��ֵ�����
	public void test3(){
		boolean result = aa();
		System.out.println("result:"+result);
	}
	
	//�����ַ���ƴ��
	public void test2(){
		String a = "hello";
		String b = "world";
		int c = 123;
		String result = "|"+c+"|";
		System.out.println(result);
	}
	//�������������
	public void test1(){
		//char a = 'A';  //65
		float a = 5.2F;
		float b = 2.0F;
		float result = a/b;
		System.out.println(result);
	}
}