package com.briup.ch11;

import java.util.Scanner;
import java.util.Arrays;

public class Hero {
	public static void main(String[] args){
		System.out.println("*********ǰ������*********");
		Scanner sc = new Scanner(System.in);
		Hero hero = new Hero();
		while(true){
			System.out.print("��������������֣�");
			String name = sc.nextLine();
			//���  ->  ������  ���  ��Ԫ�� ...
			String firstName = name.substring(0,1);
			String lastName 
					= hero.getLastNameByFirstName(firstName);
			if(lastName != null){
				System.out.println("��ǰ��Ϊ��"+firstName+lastName);
			}else{
				System.out.println("sorry! ��ǰ��δ֪...");
			}
		}
	}						
	private String[] firstNames = {"��","��","��","��"};
	private String[][] lastNames = {
		{"��","�¸�"},
		{"����","��","Ԫ��","��","����"},
		{"��ʯ","ά","˼��"},
		{"����","�޼�","��ɽ","��"}
	};

	//ͨ���ջ�ȡ��Ӧ����
	public String getLastNameByFirstName(String firstName){
		String lastName = null;
		int index = getIndex(firstName);
		if(index >= 0){
			//��ȡ����������Ӧ����������
			String[] names = lastNames[index];
			//��ȡ�����
			int i = (int)(Math.random()*names.length);
			lastName = names[i];
		}
		return lastName;
	}
	//ͨ���ջ�ȡ�����������е�λ��
	public int getIndex(String firstName){
		int i;
		for(i=0;i<firstNames.length;i++){
			if(firstName.equals(firstNames[i])){
				break;
			}
		}
		return i>=firstNames.length?-1:i;
	}
}