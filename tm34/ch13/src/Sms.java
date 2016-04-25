package com.briup.ch13;

import java.util.Scanner;
/**
	学生信息管理系统
*/
public class Sms {
	//学生数组，用于保存所有学生信息
	private Student[] stus = new Student[3];
	//表示学生数组中真正保存学生的个数
	private int index = 0;
	/**
		查找所有学生
		stus = {
			{1001,terry,12},
			{1002,larry,13},
			null
		}
		demo={
			{1001,terry,12},
			{1002,larry,13}
		}
		index = 2
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}

	/**
		添加学生
		stus =	demo={
			{1001,terry,12},
			{1001,terry,12},
			{1001,terry,12},
			null,
			null,
			null
		}
		index = 3;
	 */
	public void add(Student stu){
		if(index>=stus.length){
			//数组扩展！ 6
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index] = stu;// stus[3] = stu
		index++;
	}

	/**
		通过id删除学生 
		@author lisi
		@param 学生id
	*/
	public void deleteById(long id){
		int num = findIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	/**
		通过id查找学生
		@author zhangsan
		@param 要删除学生的id  : long
		@return 
			学生，找到了
			null， 没找到
	*/
	public Student findById(long id){
		int num = findIndexById(id);
		return num == -1?null:stus[num];
	}
	/**
		通过id查找学生在数组中的索引
		@author licy
		@param 要查找学生的id  : long
		@return 
			-1，找到了
			其他正整数， 没找到
	*/
	public int findIndexById(long id){
		int num = -1;
		for(int i=0;i<index;i++){
			if(stus[i].getId() == id){
				num = i;
				break;
			}
		}
		return num;
	}
	
	/**
		修改学生信息
	*/
	public void update(Student newStu){
		for(int i=0;i<index;i++){
			if(stus[i].getId() == newStu.getId()){
				stus[i].setName(newStu.getName());
				stus[i].setAge(newStu.getAge());
			}
		}
	}

	//菜单
	public void menu(){
		System.out.println("*********学生信息管理系统*********");
		System.out.println("* 1. 查看所有学生信息");
		System.out.println("* 2. 录入学生信息");
		System.out.println("* 3. 删除学生信息");
		System.out.println("* 4. 更新学生信息");
		System.out.println("* 5. 查询学生信息");
		System.out.println("* help. 帮助");
		System.out.println("* exit. 退出");
		System.out.println("**********************************");
	}	
	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//扫描标准输入，等待用户的输入
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("请输入功能编号：");
			//阻塞，直到用户输入回车，将回车前所有用户输入返回
			String line = sc.nextLine();
			switch(line){
				case "1":
					System.out.println("以下是所有学生的信息：");
					Student[] arr = sms.findAll();
					for(Student stu : arr){
						System.out.println(stu);
					}
					System.out.println("共计 "+sms.index+" 人");
					break;
				case "2":
					while(true){
						System.out.println("请输入学生信息【id#name#age】或者输入【break】返回上一级");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;
						}
						//1001#terry#12
						String[] stuArr = stuStr.split("#");
						long id  = Long.parseLong(stuArr[0]);//"1001"
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						Student stu = new Student(id,name,age);
						sms.add(stu);
						System.out.println("保存成功！");
					}
					
					break;
				case "3":
					while(true){
						System.out.println("请输入要删除学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("您要删除的学生不存在！");
							continue;	//结束当前循环，继续下一次循环
						}
						sms.deleteById(id);
						System.out.println("删除成功！");
					}
					break;
				case "4":
					while(true){
						System.out.println("请输入要更改学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("您要更改的学生不存在！");
							continue;	//结束当前循环，继续下一次循环
						}
						System.out.println("原有学生信息为：");
						System.out.println(stu);
						System.out.println("请输入要修改的信息【name#age】");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("修改成功");
					}
					break;
				case "5":
					while(true){
						System.out.println("请输入要查询学生的id或者break返回上一级：");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu==null){
							System.out.println("您要查询的学生不存在！");
							continue;	//结束当前循环，继续下一次循环
						}
						System.out.println(stu);
					}
					break;
				case "help":
					sms.menu();
					break;
				case "exit":
					System.out.println("bye bye!欢迎下次再访问！");
					System.exit(0);
				default:
					System.out.println("输入错误！");
			}
		}
	}	
}