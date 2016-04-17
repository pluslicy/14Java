package com.briup.ch11;

import java.util.Scanner;
/**
	学生信息管理系统
	管理学生信息的（增删改查）
	单个学生信息保存到哪里？	学生对象
	所有的学生信息保存到哪里？	数组中
*/
public class Sms{
	private Student[] stus;

	/**
	 * 添加学生信息
	 */
	public void save(Student student){
	
	}

    /**
	 *修改学生信息
	 */
	public Student update(Student student){
	
		return null;
	}

	/**
	 *删除学生信息
	 */
    public void deleteById(int id){
	
	}

	/**
	 *查询所有学生信息
	 */
	public Student[] queryAll(){

		return null;
	}

	/**
	 *通过id查找学生信息
	 */
	public Student queryByName(long id){
		return null;
	}

	/**
	 * 菜单
  	 */
	public void menu(){
		System.out.println("********学生信息管理系统********");
		System.out.println("*1 查询所有学生信息");
		System.out.println("*2 通过id查找学生信息");
		System.out.println("*3 修改学生信息");
		System.out.println("*4 录入学生信息");
		System.out.println("*5 删除学生信息");
		System.out.println("*exit 退出系统！");
		System.out.println("********************************");
		System.out.println("*请输入对应指令");
	}

	public static void main(String[] args){
		Sms sms = new Sms();
		
	}
}