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
			System.out.print("请输入【用户名#密码】：");
			String str = sc.nextLine();
			String[] arr = str.split("#");
			String name = arr[0];
			String password = arr[1];
			try{
				String username = login(name,password);
				System.out.println("欢迎您："+username);
			}catch(Exception e){
				System.out.println("登陆失败！"+e.getMessage());
			}
		}
	}
	public String login(String username,
		String password)throws Exception{
		if(username.length()>6){
			if(password.equals("briup")){
				return username;
			}else{
				//密码不正确
				throw new RuntimeException("密码不正确");
			}
		}else{
			//用户名不正确	
			throw new RuntimeException("用户名不正确");
		}
		
	}

}