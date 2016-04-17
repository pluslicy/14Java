package com.briup.ch10;
//不导包： 1 同包，2， java.lang
import java.util.Scanner;
/**
	学生信息管理系统
	添加学生
	修改学生信息
	删除学生信息
	查找学生信息
	查找所有学生信息
 */
public class Sms {
	//学生数组，用于保存所有学生信息
	private Student[] stus = new Student[3];
	//表示学生数组中真正保存学生的个数
	private int index = 0;
	/**
	  菜单，用于显示功能描述
	*/
	public void menu(){
		System.out.println("********学生信息管理系统********");
		System.out.println("*1,添加学生 ");
		System.out.println("*2,修改学生信息 ");
		System.out.println("*3,查找所有学生信息 ");
		System.out.println("*4,删除学生信息 ");
		System.out.println("*5,查找学生信息 ");
		System.out.println("*exit,退出系统 ");
		System.out.println("********************************");
		System.out.print("请输入功能编号：");
	}

	/**
		添加学生
	 */
	public void add(Student stu){
	 
	}
	/**
		删除学生 
	*/
	public void deleteById(long id){
		
	}
	/**
		通过id查找学生
	*/
	public Student findById(long id){

		return null;
	}
	/**
		查找所有学生
	*/
	public Student[] findAll(){

		return null;
	}
	/**
		修改学生信息
	*/
	public Student update(Student stu){

		return null;
	}
	public static void main(String[] args){
		Sms sms = new Sms();
		//扫描标准输入，等待用户的输入
		Scanner scanner = new Scanner(System.in);
		while(true){
			//sms.menu();
			//阻塞，直到用户输入回车，将回车前所有用户输入返回
			String line = scanner.nextLine();
			System.out.println("输入了："+line);
		}
	}	
}