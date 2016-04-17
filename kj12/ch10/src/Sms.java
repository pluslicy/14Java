package com.briup.ch10;

import java.util.*;

public class Sms {
	//学生数组，用来保存所有学生的信息的
	private Student[] stus;

	public static void main(String[] args){
		Sms sms = new Sms();
		
		while(true){
			sms.menu();
			Scanner scanner = new Scanner(System.in);
			String line = scanner.nextLine();
			System.out.println(line);
		}
	}

	//菜单
	public void menu(){
		System.out.println("********学生管理系统*******");
		System.out.println("*1，查看所有学生信息*");
		System.out.println("*2，添加学生信息*");
		System.out.println("*3，删除学生信息*");
		System.out.println("*4，查询学生信息*");
		System.out.println("*exit，退出*");
		System.out.println("***************************");


	}

	//添加学生
	public void add(Student stu){
	
	}

	//通过id删除学生
	public void deleteById(long id){
	
	}

	//通过id查询学生 ddl  dml
	public Student queryById(long id){
		Student stu = null;

		return stu;
	}

	//查看所有学生信息
	public Student[] queryAll(){
		
		return stus;
	}
}