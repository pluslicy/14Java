package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		//接受运行时参数
		int num1 = Integer.parseInt(args[0]);
		//int num2 = Integer.parseInt(args[1]);
		//int num3 = Integer.parseInt(args[2]);
		
		//2将字符串转换为int
		Flow flow = new Flow();
		//int max = flow.max(num1,num2,num3);
		//System.out.println("max:"+max);

		String week = flow.converse(num1);
		System.out.println(week);
	}
	//获取三个整数中最大的数
	public int max(int a,int b,int c){
		int max = a;
		max = a>b?(a>c?a:c):(b>c?b:c);
		/*
		if(a>b){
			if(a>c){
				max = a;
			}else{
				max = c;
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
		}
		*/
		return max;
	}
	/**
	  将数字转换为星期
	  @param num:int
	  @return String
	*/ 
	public String converse(int num){
		String week = null;
		switch(num){
			case 1:
				week = "周一";
				break;
			case 2:
				week = "周二";
				break;
			case 3:
				week = "周三";
				break;
			case 4:
				week = "周四";
				break;
			case 5:
				week = "周五";
				break;
			default:
				week = "周天";
		}
		/*
		if(num<=7 && num>=1){
			if(num == 1){
				week = "星期一";
			}else if(num == 2){
				week = "星期二";
			}else if(num == 3){
				week = "星期三";
			}else if(num == 4){
				week = "星期四";
			}else if(num == 5){
				week = "星期五";
			}else {
				week = "星期天";
			}
		}*/
		return week;
	}
}