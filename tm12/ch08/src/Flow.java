package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		//获取参数数组中第一个值
		String arg = args[0];
		//将字符串转换为整数类型
		int num = Integer.parseInt(arg);

		Flow flow = new Flow();
		String week = flow.converse2(num);
		System.out.println("今天是："+week);
	}

	//switch - case
	public String converse2(int num){
		String week = null;
		switch(num){
			case 1:{
				week = "周一";
				break;
			}
			case 2:{
				week = "周二";
				break;
			}
			case 3:{
				week = "周三";
				break;
			}
			case 4:{
				week = "周四";
				break;
			}
			case 5:{
				week = "周五";
				break;
			}
			default:{
				week = "周日";
				break;
			}
		}
		return week;
	}

	//将数字转换为星期几
	public String converse(int num){
		if(num == 1){
			return "星期一";
		}else if(num == 2){
			return "星期二";
		}else if(num == 3){
			return "星期三";
		}else if(num == 4){
			return "星期四";
		}else if(num == 5){
			return "星期五";
		}else{
			return "星期天";
		}
	}
}