package com.briup.ch08;

public class Test{
	public static void main(String[] args){
		//���������еĲ���
		String arg = args[0];
		//���ַ���ת��Ϊ��������"1"
		int num = Integer.parseInt(arg);

		Test test = new Test();
		String week = test.test3(num);
		System.out.println("���Ϊ��"+week);
	}
	public String test3(int num){
		String week = null;
		switch(num){
			default:
				week = "������";
			break;
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
			case 5:
				week = "������";
			break;
			case 6:
				week = "������";
			break;
			
		}
		return week;
	}
	/**
	  ����ת����
	  1 -����һ
	*/
	public String test2(int num){
		String week = null;
		if(num <8){
			if(num == 1){
				week = "��һ";
			}else if(num == 2){
				week = "�ܶ�";
			}else if(num == 3){
				week = "����";
			}else if(num == 4){
				week = "����";
			}else if(num == 5){
				week = "����";
			}else if(num == 6){
				week = "����";
			}else if(num == 7){
				week = "����";
			}
		}
		return week;
	}

	public void test1(){
		int a = 3;
		int b = 1;
		System.out.println(a | b);
	}
}