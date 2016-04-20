package com.briup.ch13;

import java.util.Scanner;
/**
	学生信息管理系统
	管理学生信息的（增删改查）
	单个学生信息保存到哪里？	学生对象
	所有的学生信息保存到哪里？	数组中
*/
public class Sms{
	private Student[] stus = new Student[3];//用于保存学生对象
	private int index;	//记录数组中实际学生的个数

	/**
	 * 添加学生信息
	   save 
	     stus[0] = stu;  index = 1
		 stus[1] = stu;  index = 2
		 stus[2] = stu;	 index = 3
		 stus[3]
	 */
	public void save(Student student){
		if(index >= stus.length){
			//数组的扩展
			Student[] demo = new Student[stus.length+3];
			System.arraycopy(stus,0,demo,0,index);
			stus = demo;
		}
		stus[index++] = student;
	}

    /**
	 *修改学生信息
	 stus = {
		1001 terry,
		1003 tom3,
		1004 tom4,
		1005 tom5,
		1006 tom6,
		null
	 }
		1006 terry
	 */
	public void update(Student student){
		for(int i=0;i<index;i++){
			if(student.getId() == stus[i].getId()){
				stus[i].setName(student.getName());
			}
		}
	}

	/**
	 *删除学生信息
	 stus = new Student[6];
	 stus = {
		1001 terry,
		1003 tom3,
		1004 tom4,
		1005 tom5,
		1006 tom6,
		null
	 }
	 index = 6;
	 1002    num = 1;
	 for(int i=1;i<5;i++){
		stus[i] = stus[i+1]
		//stus[4] = stus[5]

	 }
	 */
    public void deleteById(long id){
		int num = getIndexById(id);
		for(int i=num ;i<index-1;i++){
			stus[i] = stus[i+1];
		}
		stus[--index] = null;
	}

	/**
	 *查询所有学生信息
	 */
	public Student[] queryAll(){
		Student[] demo = new Student[index];
		System.arraycopy(stus,0,demo,0,index);
		return demo;
	}

	/**
	 *通过id查找学生信息

	 */
	public Student queryById(long id){
		int num = getIndexById(id);
		return num==-1?null:stus[num];
	}

	/**
	 根据学生对象的id获取该学生对象在数组中的索引
	 stus = new Student[3];
	 1001 terry
	 1002 larry
	 null 

	 1003
	*/
	private int getIndexById(long id){
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
	 * 菜单
  	 */
	public void menu(){
		System.out.println("********学生信息管理系统********");
		System.out.println("*1 查询所有学生信息");
		System.out.println("*2 录入学生信息");
		System.out.println("*3 删除学生信息");
		System.out.println("*4 通过id查找学生信息");
		System.out.println("*5 修改学生信息");
		System.out.println("*exit 退出系统！");
		System.out.println("*help 获取帮助");
		System.out.println("********************************");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		sms.menu();
		//扫描器对象
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("*请输入对应指令:");
			String option = sc.nextLine();
			switch(option){
				case "1":	//查询所有
					System.out.println("以下是所有学生的信息：");
					Student[] stus = sms.queryAll();
					for(Student stu : stus){
						System.out.println(stu);
					}
					System.out.println("总共查询到"+sms.index+"个学生");
					break;
				case "2":	//录入
					while(true){
						System.out.println("请输入学生的信息【id#name#age】或输入【break】返回上一级目录");
						String stuStr = sc.nextLine();
						if(stuStr.equals("break")){
							break;//返回到上一级目录
						}
						//stuStr 1001#terry#12字符串 ->对象->数组
						String[] stuArr = stuStr.split("#");
						//将数组中个元素转换为学生属性所需要的数据类型
						long id  = Long.parseLong(stuArr[0]);
						String name = stuArr[1];
						int age = Integer.parseInt(stuArr[2]);
						//封装对象
						Student stu = new Student(id,name,age);
						sms.save(stu);
						System.out.println("保存成功！");
					}
					break;
				case "3":	//删除
					while(true){
						System.out.println("请输入要删除学生的id,或者输入break返回上一级目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						//查询要删除的学生信息是否存在
						Student stu = sms.queryById(id);
						if(stu==null){
							System.out.println("您要删除的用户信息不存在！");
							continue;
						}
						sms.deleteById(id);
						System.out.println("删除成功！");
					}	
					break;
				case "4":	//通过id获取
					while(true){
						System.out.println("请输入要查找学生的id,或者输入break返回上一级目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						Student stu = sms.queryById(id);
						System.out.println(stu==null?"sorry,not found!":stu);
					}	
					break;
				case "5":	//修改
					while(true){
						System.out.println("请输入要修改学生的id,或者输入break返回上一级目录");
						String idStr = sc.nextLine();
						if(idStr.equals("break")){
							break;
						}
						long id = Long.parseLong(idStr);
						//查询要删除的学生信息是否存在
						Student stu = sms.queryById(id);
						if(stu==null){
							System.out.println("您要修改的用户信息不存在！");
							continue;
						}
						System.out.println("原信息为："+stu);
						System.out.println("请输入新信息【name#age】：");
						// tom#12
						String str = sc.nextLine();
						String[] stuArr = str.split("#");
						String name = stuArr[0];
						int age = Integer.parseInt(stuArr[1]);
						Student newStu = new Student(id,name,age);
						sms.update(newStu);
						System.out.println("修改成功！");
					}	
					break;
				case "exit":
					System.out.println("bye bye,欢迎再次使用！");
					System.exit(0);
				case "help":
					sms.menu();
					break;
				default:
					System.out.println("输入错误！");

			}
		}
	}
}