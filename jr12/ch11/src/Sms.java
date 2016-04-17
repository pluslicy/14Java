package com.briup.ch11;

import java.util.Scanner;	//corejava + API

/**
 student manager system
 学生信息管理系统
 1. CoreJava					JavaEE(后台技术)
	后台功能
								前端技术(命令行)
 2. html/css/js 前端技术		Webui(前端技术(pc端))
 3. corejava/android/H5			Android(前端技术(移动端))
 4.	c语言,swift.../H5			IOS(前端技术(移动端))
 html/GUI

*/
public class Sms{
	private Student[] stus = new Student[3];
	private int index = 0;	//数组中学生的个数

	/**
	  程序入口
	*/
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//创建扫描器对象
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("请输入功能编号：");
			//监控标准输入，当用户输入回车，该方法可以将回车之前所有的用户输入返回
			String option = scanner.nextLine();
			switch(option){
				case "1":	//查询所有学生信息
					System.out.println("以下为所有学生的信息：");
					Student[] stus = sms.findAll();
					for(int i=0;i<stus.length;i++){
						System.out.println(stus[i]);
					}
					break;
				case "2":	//添加学生信息
					while(true){
						System.out.println("请输入学生信息【id#name#age】或者输入break返回上一级目录");
						//接受用户的输入
						String stuStr = scanner.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//分割字符串
						String[] stuArr = stuStr.split("#");
						//将字符串转换为int
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//封装对象
						Student stu = new Student(id,name,age);
						sms.save(stu);
					}
					break;
				case "3":
					break;
				case "4":
					break;
				case "5":
					break;
				case "exit":
					System.out.println("欢迎再次使用系统");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("输入出错！请重新输入。");
			}
		}
	}
	//菜单
	public void menu(){
		System.out.println("**********学生信息管理系统**********");
		System.out.println("**1. 查询所有学生信息");
		System.out.println("**2. 添加学生信息");
		System.out.println("**3. 删除学生信息");
		System.out.println("**4. 修改学生信息");
		System.out.println("**5. 根据学号查询学生信息");
		System.out.println("**exit. 退出系统");
		System.out.println("**help. 帮助");
		System.out.println("************************************");
	}
	
	//保存学生信息
	public void save(Student stu){
		//index 数组中学生个数 3  stus.length 数组长度 3
		if(index>=stus.length){
			//数组扩展
			Student[] demo = new Student[stus.length+5];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = stu;
	
	}
	//删除信息
	public void deleteById(long id){
	
	}
	//查询
	public Student findById(long id){
		return null;
	}
	//查询所有
	public Student[] findAll(){
		//数组拷贝技术 stus = {{},{},null} ->stusDemo={{},{}}
		Student[] stusDemo = new Student[index];
		System.arraycopy(stus,0,stusDemo,0,index);
		return stusDemo;
	}
	//修改
	public Student update(Student stu){

		return null;
	}

}