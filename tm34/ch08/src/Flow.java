package com.briup.ch08;

public class Flow {
	// java -cp ./bin com.briup.ch08.Flow 4 2 3
	// args = [1,2,3]; len= 3;
	public static void main(String[] args){
		int len = args.length;
		//�����鳤�ȴ���0��ʱ���ȥת��
		if(len>0){
			//	���ַ���ת��Ϊ����
			int num = Integer.parseInt(args[0]);
			Flow flow = new Flow();
			String week = flow.test2(num);
			System.out.println("������:"+week);
		}
	}

	/**
	 ��һ������ת��Ϊ���ڼ�
	 1  -> ����һ
	 ....
	 ��ҵ�� ״̬ͼ
	 */
	public String test1(int num){
		String week = null;//��ʼ��Ϊnull
		if(num>=0 && num <=7){
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
		//  101    Ҽ����ҼԲ��
		return week;
	}

	public String test2(int num){
		String week = null;
		if(num>=0 && num<=7){
			switch(num){
				case 1:
					week = "��һ";
				break;
				case 2:
					week = "�ܶ�";
				break;
				default:
					week = "����";
				case 3:
					week = "����";
				break;
				case 4:
					week = "����";
				break;
				case 5:
					week = "����";
				break;
				
			}
		}
		return week;
	}
}