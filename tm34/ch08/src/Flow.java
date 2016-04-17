package com.briup.ch08;

public class Flow {
	// java -cp ./bin com.briup.ch08.Flow 4 2 3
	// args = [1,2,3]; len= 3;
	public static void main(String[] args){
		int len = args.length;
		//当数组长度大于0的时候才去转换
		if(len>0){
			//	将字符串转换为数子
			int num = Integer.parseInt(args[0]);
			Flow flow = new Flow();
			String week = flow.test2(num);
			System.out.println("今天是:"+week);
		}
	}

	/**
	 将一个数字转换为星期几
	 1  -> 星期一
	 ....
	 作业： 状态图
	 */
	public String test1(int num){
		String week = null;//初始化为null
		if(num>=0 && num <=7){
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
		//  101    壹佰零壹圆整
		return week;
	}

	public String test2(int num){
		String week = null;
		if(num>=0 && num<=7){
			switch(num){
				case 1:
					week = "周一";
				break;
				case 2:
					week = "周二";
				break;
				default:
					week = "周天";
				case 3:
					week = "周三";
				break;
				case 4:
					week = "周四";
				break;
				case 5:
					week = "周五";
				break;
				
			}
		}
		return week;
	}
}