package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		// args���鳤��  args = [5,6];
		int len = args.length;
		if(len >0){
			//��ȡargs�����еĵ�һ��Ԫ��
			String arg = args[0]; //  "5"
			//���ַ���ת��Ϊ������������ int
			int num = Integer.parseInt(arg); //5

			Flow flow = new Flow();
			String week = flow.test2(num);
			System.out.println("������:"+week);
		}else{
			System.out.println("��������Ҫת����ֵ");
		}
	}
	/**
	����ת������
       1 -> ����һ
       2 -> ���ڶ�
       ...
       6,7    ������

       ����   null
	   byte  /u0000

	   ״̬ͼ
	     ����  ����
	*/ 
	public String test1(int num){
		String week = null;
		if(1<=num && num<=7){
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
			}else{
				week = "������";
			}
		}
		return week;
	}

	public String test2(int num){
		String week = null;
		if(num>=1 && num<=7){
			switch(num){
				case 1:{
					week = "����һ";
					break;
				}
				case 2:{
					week = "���ڶ�";
					break;
				}
				default:{
					week = "������";
					break;
				}
				case 3:{
					week = "������";
					break;
				}
				case 4:{
					week = "������";
					break;
				}
				case 5:{
					week = "������";
					break;
				}
			}
		}
		return week;
	}
}