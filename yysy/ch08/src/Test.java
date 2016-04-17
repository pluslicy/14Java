package com.briup.ch08;

public class Test{
	public static void main(String[] args){
		//接受命令中的参数
		String arg = args[0];
		//将字符串转换为整数类型"1"
		int num = Integer.parseInt(arg);

		Test test = new Test();
		String week = test.test3(num);
		System.out.println("结果为："+week);
	}
	public String test3(int num){
		String week = null;
		switch(num){
			default:
				week = "星期天";
			break;
			case 1:
				week = "星期一";
			break;
			case 2:
				week = "星期二";
			break;
			case 3:
				week = "星期三";
			break;
			case 4:
				week = "星期四";
			break;
			case 5:
				week = "星期五";
			break;
			case 6:
				week = "星期六";
			break;
			
		}
		return week;
	}
	/**
	  星期转换器
	  1 -》周一
	*/
	public String test2(int num){
		String week = null;
		if(num <8){
			if(num == 1){
				week = "周一";
			}else if(num == 2){
				week = "周二";
			}else if(num == 3){
				week = "周三";
			}else if(num == 4){
				week = "周四";
			}else if(num == 5){
				week = "周五";
			}else if(num == 6){
				week = "周六";
			}else if(num == 7){
				week = "周日";
			}
		}
		return week;
	}

	public void test1(){
		int a = 3;
		int b = 1;
		System.out.println(a | b);
	}
}