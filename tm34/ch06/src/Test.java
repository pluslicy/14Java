package com.briup.ch06;

public class Test {
	public static void main(String[] args){
		School sc1 = new School();
		sc1.setId(1001L);
		sc1.setName("��������ѧ");
		sc1.setAddress("�����ϲ�");
		sc1.setGender('��');
		System.out.println(sc1);

		School sc2 = new School(1002L,"��������","�����ϲ�",'Ů');
		System.out.println(sc2);
	}
}