package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		//���潭������ѧ�������������Ϣ
		/**
		   1. ��Student����ص��ڴ��С�
		   2. ����Student�ࣨģ�壩�����ڴ�ռ䡣
		   3. jvm��ʼ������
				char '\u0000'  a
				byte	0
				short	0
				int		0
				long	0L
				float	0.0F
				double	0.0D
				boolean	false
				����	null
			4.���ù��캯�����г�ʼ��
			5.�������ڶ��ڴ��е��ڴ��ַ����sc1
		*/
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("��������ѧ");
		sc1.setAddress("�����ϲ�");
		System.out.println(sc1);

		School sc2 = new School(1002,"��������","�����ϲ�");
		System.out.println(sc2);
		
	}
}