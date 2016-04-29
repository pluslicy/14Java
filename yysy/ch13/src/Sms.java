package com.briup.ch13;

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
	  @author zhangsan
	  @param 要添加的学生
	*/
	public void save(Student stu){
		//当学生的个数超过数组所能容纳的范围的时候需要对数组进行扩展
		if(index >= stus.length){
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = stu;
	}
	/**
	  查询所有学生
	  @author  lisi
	  @return 包含所有学生的数组
	*/
	public Student[] findAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}
	/**
	  通过id查询学生
	  @author wangwu
	  @param id
	  @return
		null	没找到
		stu		查询到的学生
	*/
	public Student findById(long id){
		//1,通过id找位置
		int num = findIndexById(id);
		//2,把该位置上的对象返回
		return num==-1?null:stus[num];
	}
	/**
	  通过id查找索引
	  @author licy
	  @param id
	  @return 
		-1		找不到
		正整数	该学生在数组中的位置
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
	  通过id删除学生
	  @author zhaoliu
	  @param id

	  stus = {
		{1001,terry,12},
		{1003,terry,12},
		{1004,terry,12},
		null,
		null,
		null
	  }
	  index = 3;
	  id = 1002
	  num = 1
	  stus[1] = stus[1+1]
	  stus[2] = stus[2+1]

	*/
	public void deleteById(long id){
		int num = findIndexById(id);
		for(int i=num;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}
	/**
	  更新学生信息,id不能修改
	  @author guoqi
	  @paran 学生对象
	  1001:terry:12
	  1001:TERRY:13
	*/
	public void update(Student newStu){
		for(int i=0;i<index;i++){
			if(stus[i].getId() == newStu.getId()){
				stus[i].setName(newStu.getName());
				stus[i].setAge(newStu.getAge());
			}
		}
	}

	/**
		菜单
		@auhor
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
						String[] stuArr = stuStr.split("#");
						//将用户的输入进行处理
						long id = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//封装对象
						Student stu = new Student(id,name,age);
						//调用保存方法
						sms.save(stu);
						System.out.println("录入成功！");
						
					}
					break;
				}
				case "3":{//删除学生信息
					while(true){
						System.out.println("请输入要删除学生的【id】或者输入【break】返回主目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//将字符串id转换为长整型
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("该学生不存在！");
							continue;
						}
						sms.deleteById(id);
						System.out.println("删除成功！");
					}

					break;
				}
				case "4":{//查看学生信息
					while(true){
						System.out.println("请输入要查找学生的【id】或者输入【break】返回主目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//将字符串id转换为长整型
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("该学生不存在！");
							continue;
						}
						System.out.println(stu);
					}
					break;
				}
				case "5":{
					while(true){
						System.out.println("请输入要修改学生的【id】或者输入【break】返回主目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						//将字符串id转换为长整型
						long id = Long.parseLong(idStr);
						Student stu = sms.findById(id);
						if(stu == null){
							System.out.println("您要修改的学生信息不存在！");
							continue;
						}

						System.out.println("您要修改的学生信息为："+stu);
						System.out.println("请输入该学生的新信息【name#age】");
						String stuStr = sc.nextLine();
						String[] stuArr = stuStr.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("修改成功");
					}
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