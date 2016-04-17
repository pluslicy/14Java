package com.briup.ch03;
/**
 * 这是一个学生类，用来保存学生的信息
 */
public class Student{
	/**
	 * 这个是id,唯一标识一个学生
	 */
	private long id;
	/**
	 * 这个是名字
	 */
	private String name;
	/**
	 * 这个是年龄
	 */
	private int age;
	

	/**
	 * 这个加法运算
	 */
	public int add(int a,int b){
		return a+b;
	}

	/**
	 * 这个是玩游戏的方法
	 */
	public void playGame(String name){
		System.out.println("play "+name);
	}

}