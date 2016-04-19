package com.briup.ch12;

import java.util.Scanner;

public class Sms {
	//学生数组，用来保存所有学生的信息的
	private Student[] stus = new Student[3];
	private int index = 0; //学生的个数
	//添加学生
	public void add(Student stu){
		//如果数组中的元素的个数大于等于数组长度的时候，说明数组长度不够
		if(index>=stus.length){
			//数组扩展
			Student[] demo = new Student[stus.length+3];
			//数组的拷贝
			System.arraycopy(stus,0,demo,0,stus.length);
			stus = demo;
		}
		stus[index++] = stu;// stus[index] = stu; index++;
	}
	/**
	stus = {
		{1001,terry},
		{1002,larry},	
		{1003,tom},
		null,
		null
	
	}
	// 1002  stuIndex = 1; index = 3
	for(int i=1;i<2;i++){
		//stus[0] = stus[1]
		//stus[1] = stus[2]
		stus[2] = stus[3]
	}
	index = 3

	{1,2,4,5,6,7,8,9,0}
	*/
	//通过id删除学生 1002  1T  "HELLO WORLD"
	public void deleteById(long id){
		//调用方法获取id为指定参数，所在数组中的位置
		int stuIndex = queryIndexById(id); // 1
		if(stuIndex!=-1){
			for(int i=stuIndex;i<index-1;i++){
				stus[i] = stus[i+1];
			}
			stus[--index] = null;
		}
	}
	
	//通过id查找该学生所在的位置 1002
	private int queryIndexById(long id){
		int stuIndex= -1;
		for(int i=0;i<index;i++){
			if(stus[i].getId() == id){
				stuIndex = i;
				break;
			}
		}
		return stuIndex;
	}
	//通过id查询学生 ddl  dml
	public Student queryById(long id){
		//调用方法获取id为指定参数，所在数组中的位置
		int stuIndex = queryIndexById(id);
		return stuIndex==-1?null:stus[stuIndex];
	}

	//查看所有学生信息
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
	{
	{1001,terry,12},
	{1002,larry,13},
	null
	}
	1002
	{1002,larry,13}
	请输入。。。。[name,age]
	tom#14

	{1002,tom,14}
	*/  
	public void update(Student stu){
		for(int i=0;i<index;i++){
			if(stu.getId() == stus[i].getId()){
				stus[i].setName(stu.getName());
				stus[i].setAge(stu.getAge());
			}
		}
	}
	//菜单
	public void menu(){
		System.out.println("********学生管理系统*******");
		System.out.println("*1，查看所有学生信息*");
		System.out.println("*2，添加学生信息*");
		System.out.println("*3，删除学生信息*");
		System.out.println("*4，查询学生信息*");
		System.out.println("*5，修改学生信息*");
		System.out.println("*exit，退出*");
		System.out.println("*help，帮助*");
		System.out.println("***************************");
	}

	public static void main(String[] args){
		//创建sms对象
		Sms sms = new Sms();
		sms.menu();	//显示主页面
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.print("请输入功能编号：");
			//等待用户输入功能编号，等用户输入回车的时候获取回车前输入的内容
			String option = scanner.nextLine();
			switch(option){
				case "1"://查询所有
					System.out.println("以下是所有学生的信息：");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("总计："+stus.length+" 人");
					break;
				case "2"://添加
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
						//判断该用户id是否已经被人占用
						Student dbStu = sms.queryById(id);
						if(dbStu!=null){
							System.out.println("该id已经被人占用，请重新录入！");
							continue;
						}

						sms.add(stu);
						System.out.println("添加成功！");
					}
					
					break;
				case "3"://删除
					while(true){
						System.out.print("请输入您要删除学生的id或break返回上一级目录:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						sms.deleteById(Long.parseLong(id));
						System.out.println("删除成功！学生个数为："+sms.index);
					}
					break;
				case "4"://查询
					while(true){
						System.out.print("请输入您要查询学生的id或break返回上一级目录:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						Student stu = sms.queryById(Long.parseLong(id));
						System.out.println("以下是您要查找的学生的信息：");
						System.out.println(stu!=null?stu:"not found!");
					}
					break;
				case "5"://修改
					while(true){
						System.out.print("请输入您要修改学生的id或break返回上一级目录:");
						String id = scanner.nextLine();
						if(id.equals("break")){
							break;
						}
						Student stu = sms.queryById(Long.parseLong(id));
						if(stu == null){
							System.out.println("该学生不存在！");
							continue;
						}
						System.out.println("原信息为："+stu);
						System.out.println("请输入您要修改的信息【name#age】");
						String stuStr = scanner.nextLine();
						String[] stuArr = stuStr.split("#");

						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);

						Student newStu = new Student(Long.parseLong(id),name,age);

						sms.update(newStu);
						System.out.println("修改成功！");
					}
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