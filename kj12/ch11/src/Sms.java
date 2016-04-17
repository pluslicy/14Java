package com.briup.ch11;

import java.util.Scanner;

public class Sms {
	//学生数组，用来保存所有学生的信息的
	private Student[] stus = new Student[3];
	private int index = 0; //学生的个数
	//添加学生
	public void add(Student stu){
		//数组扩展
		if(index>=stus.length){
			Student[] demo = new Student[stus.length+3];
			// stus -> demo
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;
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
		Student[] demo = new Student[index];
		//stus -> demo
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	//菜单
	public void menu(){
		System.out.println("********学生管理系统*******");
		System.out.println("*1，查看所有学生信息*");
		System.out.println("*2，添加学生信息*");
		System.out.println("*3，删除学生信息*");
		System.out.println("*4，查询学生信息*");
		System.out.println("*exit，退出*");
		System.out.println("*help，帮助*");
		System.out.println("***************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("请输入功能编号：");
			String option = scanner.nextLine();
			switch(option){
				case "1":
					System.out.println("以下是所有学生的信息：");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("总计："+stus.length+" 人");
					break;
				case "2":
					while(true){
						System.out.println("请输入学生信息【id#name#age】或者输入break回到上一级目录");
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						String[] stuArr = stuStr.split("#");
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//封装对象
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("添加成功！");
					}
					
					break;
				case "3":
					break;
				case "4":
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye");
					System.exit(0);
				default:
					System.out.println("输入出错，请重新输入！");
			}
		}
			
	}
}