package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		//���潭������ѧ�������������Ϣ
		/**
			1. ��School����ص��ڴ���
			2. ����School��(ģ��)�ڶ��п����ڴ�ռ�
			3. jvm�Զ����е����Խ��г�ʼ��
				 char	\u0000  �ո�
				 byte	0
				 short	0
				 int	0
				 long	0L
				 float	0.0F
				 double	0.0D
				 boolean false
				 ������������   null
					String
					Student
					School
			4. ���ù��캯����ɶ�����Զ����ʼ��
			5.���ö������ڴ��е��׵�ַ����
		 */
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("��������ѧ");
		sc1.setAddress("�����ϲ�");
		System.out.println(sc1);

		School sc2 = new School(1002L,"��������","�����ϲ�");
		System.out.println(sc2);
	}
}