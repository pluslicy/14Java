package com.briup.ch08;

public class Test{
	public static void main(String[] args){
		//将字符串转换为int类型
		int num = Integer.parseInt(args[0]);
		Test test = new Test();
		String result = test.converse2(num);
		System.out.println(result);
	}

	
	public String converse2(int num){
		String week = null;
		switch(num){
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
			default:
				week ="星期天";
			break;
		}
		return week;
	}
	/**
		星期转换器  
		1  -  星期一
		2  -  星期二
		...
	*/
	public String converse(int num){
		if(num == 1){
			return "星期一";
		}else if(num == 2){
			return "星期二";
		}else if(num == 3){
			return "星期三";
		}else{
			return "星期天";
		}
	}
	public void test2(int a){
		if(a>3){
			System.out.println("a>3");
		}
		System.out.println("---");
	}
	//测试隐式转换
	public void test1(){
		long b = 1L;
		int c = (int)b;
		System.out.println(c);

		Object d = new Test();//"hello";//new Test();
		String e = toString(d);
		System.out.println(e);
	}
	public String toString(Object obj){
		if(obj instanceof String){
			return (String)obj;
		}else{
			return null;
		}
	}
}