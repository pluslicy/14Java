package com.briup.ch09;

//import java.lang.Math;
/**
  不用写import
     1.访问同包下的类
	 2.访问java.lang下的类
*/
public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test7();
	}
	public void test7(){
		int[] aa = new int[]{1,2,3,4};
		int[][] arr = new int[][]{
				new int[]{1,2,3},
				new int[]{4,5,6},
			};

	
		for(int i=0;i<arr.length;i++){
			//arr[i] 存放的是第二个维度的数组的引用地址
			System.out.print(arr[i]+":");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}
	public void test6(){
		int[][] arr;
		//arr = new int[3][2];
		arr = new int[3][];
		arr[0] =new int[]{1,2,3,4};
		arr[1] =new int[2];
		arr[2] =new int[]{5,2,1};
		
		for(int i=0;i<arr.length;i++){
			//arr[i] 存放的是第二个维度的数组的引用地址
			System.out.print(arr[i]+":");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
	}


	public void test5(){
		//保存小组的所有成员的信息  4名学生组成一组
		//String[] args = new String[4];

		//数组的声明
		Student[] stus = new Student[4];
		//数组的初始化
		stus[0] = new Student(1001,"larry",13);
		stus[1] = new Student(1002,"tarry",13);
		stus[2] = new Student(1003,"jacky",13);
		stus[3] = new Student(1004,"tom",13);

		//数组的访问  stus
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i]);
		}

		

	}

	public void test4(){
		//创建一个长度为5的整型数组，并且存放0~100之间的随机数
		int[] arr = new int[5];
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*100);//0~1
		}

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	public void test3(){
		String[] args = new String[]{"terry","larry","13"};
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]);
		}
	}

	public void test2(){
		String[] args ;
		args = new String[3];

		args[0] = "terry";
		args[1] = "larry";
		args[2] = "3";

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
	}

	//测试对象的初始化
	public void test1(){
		Student stu = new Student();
		stu.id = 1001;
		stu.name = "terry";
		stu.age = 12;

		Student stu2 = new Student(1002,"larry",13);

		System.out.println(stu);
		System.out.println(stu2);
	}
	
}