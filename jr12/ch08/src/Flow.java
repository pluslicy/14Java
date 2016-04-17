package com.briup.ch08;

public class Flow {
	public static void main(String[] args){
		// args数组长度  args = [5,6];
		int len = args.length;
		if(len >0){
			//获取args数组中的第一个元素
			String arg = args[0]; //  "5"
			//将字符串转换为基本数据类型 int
			int num = Integer.parseInt(arg); //5

			Flow flow = new Flow();
			String week = flow.test2(num);
			System.out.println("今天是:"+week);
		}else{
			System.out.println("请输入您要转换的值");
		}
	}
	/**
	星期转换器：
       1 -> 星期一
       2 -> 星期二
       ...
       6,7    星期天

       其他   null
	   byte  /u0000

	   状态图
	     菱形  条件
	*/ 
	public String test1(int num){
		String week = null;
		if(1<=num && num<=7){
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
			}else{
				week = "星期天";
			}
		}
		return week;
	}

	public String test2(int num){
		String week = null;
		if(num>=1 && num<=7){
			switch(num){
				case 1:{
					week = "星期一";
					break;
				}
				case 2:{
					week = "星期二";
					break;
				}
				default:{
					week = "星期天";
					break;
				}
				case 3:{
					week = "星期三";
					break;
				}
				case 4:{
					week = "星期四";
					break;
				}
				case 5:{
					week = "星期五";
					break;
				}
			}
		}
		return week;
	}
}