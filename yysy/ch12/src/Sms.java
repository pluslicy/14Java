package com.briup.ch12;

import java.util.Scanner;
/**
	业务类
	学生信息管理系统
	单个学生信息保存到学生对象，学生对象保存在数组（不能持久化保存）
*/
public class Sms {
	private Student[] stus;	//存储学生对象的数组
	private int index;		//记录数组中学生的个数

	public Sms(){
		this.stus = new Student[3];
		this.index = 0;
	}
	/**
		添加学生信息
	*/
	public void save(Student stu){
		
	}
	/**
		查询所有学生
		stus = {
			{1001,terry,12},
			{1002,larry,12},
			null
		}
		index = 2;
		git 5
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
		通过id查询学生
	*/
	public Student findById(long id){
		return null;
	}
	/**
		通过id删除学生
	*/
	public void deleteById(long id){
		
	}
	/**
		更新学生信息
	*/
	public void update(Student newStu){
	
	}

	/**
		菜单
	*/
	public void menu(){
		System.out.println("***********学生信息管理系统***********");
		System.out.println("*1. 查询所有学生信息");
		System.out.println("*2. 录入学生信息");
		System.out.println("*3. 删除学生信息");
		System.out.println("*4. 查看学生信息");
		System.out.println("*5. 更改学生信息");
		System.out.println("*help. 帮助");
		System.out.println("*exit. 退出");
		System.out.println("**************************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();	
		Scanner sc = new Scanner(System.in);
		sms.menu();
		while(true){
			System.out.print("请输入功能编号：");
			String option = sc.nextLine();
			switch(option){
				case "1":{//查询所有学生信息
					System.out.println("以下是所有学生的信息：");
					//调用方法查询所有学生信息
					Student[] arr = sms.findAll();
					//遍历
					for(Student stu : arr){
						System.out.println(stu);
					}
					System.out.println("总计 "+sms.index+"人");
					break;
				}
				case "2":{//录入学生信息
					while(true){
						System.out.println("请输入学生信息【id#name#age】或者输入【break】返回主菜单");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						System.out.println(stuStr);
					}
					break;
				}
				case "3":{

					break;
				}
				case "4":{

					break;
				}
				case "5":{

					break;
				}
				case "exit":{
					System.out.println("bye bye!欢迎再次使用！");
					System.exit(0);
				}
				case "help":{
					sms.menu();
					break;
				}
				default:
					System.out.println("输入有误！");
			}
		}
	}
}