package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		//��������ʱ����
		int num1 = Integer.parseInt(args[0]);
		//int num2 = Integer.parseInt(args[1]);
		//int num3 = Integer.parseInt(args[2]);
		
		//2���ַ���ת��Ϊint
		Flow flow = new Flow();
		//int max = flow.max(num1,num2,num3);
		//System.out.println("max:"+max);

		String week = flow.converse(num1);
		System.out.println(week);
	}
	//��ȡ����������������
	public int max(int a,int b,int c){
		int max = a;
		max = a>b?(a>c?a:c):(b>c?b:c);
		/*
		if(a>b){
			if(a>c){
				max = a;
			}else{
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		*/
		return max;
	}
	/**
	  ������ת��Ϊ����
	  @param num:int
	  @return String
	*/ 
	public String converse(int num){
		String week = null;
		switch(num){
			case 1:
				week = "��һ";
				break;
			case 2:
				week = "�ܶ�";
				break;
			case 3:
				week = "����";
				break;
			case 4:
				week = "����";
				break;
			case 5:
				week = "����";
				break;
			default:
				week = "����";
		}
		/*
		if(num<=7 && num>=1){
			if(num == 1){
				week = "����һ";
			}else if(num == 2){
				week = "���ڶ�";
			}else if(num == 3){
				week = "������";
			}else if(num == 4){
				week = "������";
			}else if(num == 5){
				week = "������";
			}else {
				week = "������";
			}
		}*/
		return week;
	}
}