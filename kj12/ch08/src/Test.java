package com.briup.ch08;

public class Test{
	public static void main(String[] args){
		//���ַ���ת��Ϊint����
		int num = Integer.parseInt(args[0]);
		Test test = new Test();
		String result = test.converse2(num);
		System.out.println(result);
	}

	
	public String converse2(int num){
		String week = null;
		switch(num){
			case 1:
				week = "����һ";
			break;
			case 2:
				week = "���ڶ�";
			break;
			case 3:
				week = "������";
			break;
			case 4:
				week = "������";
			break;
			default:
				week ="������";
			break;
		}
		return week;
	}
	/**
		����ת����  
		1  -  ����һ
		2  -  ���ڶ�
		...
	*/
	public String converse(int num){
		if(num == 1){
			return "����һ";
		}else if(num == 2){
			return "���ڶ�";
		}else if(num == 3){
			return "������";
		}else{
			return "������";
		}
	}
	public void test2(int a){
		if(a>3){
			System.out.println("a>3");
		}
		System.out.println("---");
	}
	//������ʽת��
	public void test1(){
		long b = 1L;
		int c = (int)b;
		System.out.println(c);

		Object d = new Test();//"hello";//new Test();
		String e = toString(d);
		System.out.println(e);
	}
	public String toString(Object obj){
		if(obj instanceof String){
			return (String)obj;
		}else{
			return null;
		}
	}
}