package com.briup.ch13;

import java.util.Scanner;

public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test2();
	}
	public void test2(){
		Student stu = new Student();
		stu.setId(1001L);
		System.out.println(stu);
		Student stu2 = new Student();
		stu2.setId(1002L);
		System.out.println(stu2);
	}
	public void test1(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("�����롾�û���#���롿��");
			String str = sc.nextLine();
			String[] arr = str.split("#");
			String name = arr[0];
			String password = arr[1];
			try{
				String username = login(name,password);
				System.out.println("��ӭ����"+username);
			}catch(Exception e){
				System.out.println("��½ʧ�ܣ�"+e.getMessage());
			}
		}
	}
	public String login(String username,
		String password)throws Exception{
		if(username.length()>6){
			if(password.equals("briup")){
				return username;
			}else{
				//���벻��ȷ
				throw new RuntimeException("���벻��ȷ");
			}
		}else{
			//�û�������ȷ	
			throw new RuntimeException("�û�������ȷ");
		}
		
	}

}