package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		//��ȡ���������е�һ��ֵ
		String arg = args[0];
		//���ַ���ת��Ϊ��������
		int num = Integer.parseInt(arg);

		Flow flow = new Flow();
		String week = flow.converse2(num);
		System.out.println("�����ǣ�"+week);
	}

	//switch - case
	public String converse2(int num){
		String week = null;
		switch(num){
			case 1:{
				week = "��һ";
				break;
			}
			case 2:{
				week = "�ܶ�";
				break;
			}
			case 3:{
				week = "����";
				break;
			}
			case 4:{
				week = "����";
				break;
			}
			case 5:{
				week = "����";
				break;
			}
			default:{
				week = "����";
				break;
			}
		}
		return week;
	}

	//������ת��Ϊ���ڼ�
	public String converse(int num){
		if(num == 1){
			return "����һ";
		}else if(num == 2){
			return "���ڶ�";
		}else if(num == 3){
			return "������";
		}else if(num == 4){
			return "������";
		}else if(num == 5){
			return "������";
		}else{
			return "������";
		}
	}
}