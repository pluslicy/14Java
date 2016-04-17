package com.briup.ch10;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test4(){
		
	
	}
	public void test3(){
		/*
		int[][] arr = new int[3][];
		arr[0] = new int[]{1,2,3};
		arr[1] = new int[2];
		arr[2] = new int[]{8};
		*/
		/*
		int[][] arr = new int[][]{
					new int[]{5,2,1},
					new int[]{8,6,3},
					new int[]{1,1},
					new int[]{9}
				};
		*/
		//声明和初始化一定要放在一起
		//int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

		int[][] arr = new int[3][4];

		System.out.println("数组长度："+arr.length);
		for(int i=0;i<arr.length;i++){
			//arr[i]
			System.out.print("第"+(i+1)+"个数组：");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/*
			i=0;i<3 true
				"第1个数组"
				j=0;i<3 true;arr[0][0] "1,"
				j=1;j<3 true;arr[0][1] "2,"
				j=2;j<3 true;arr[0][2] "3,"
				j=3;j<3 false;
				"\n"
			i=1;i<3 true
				"第2个数组"
				j=0;j<2 true;arr[1][0] "0,"
				j=1;j<2 true;arr[1][1] "0,"
				j=2;j<2 false;
				"\n"
			i=2;i<3 true
				"第2个数组"
				j=0;j<1 true;arr[2][0] "8,"
				j=1;j<1 false;
				"\n"
			i=3;i<3 false




			
		
		*/
	}










	//测试数组使用
	public void test1(){
		int[] arr = new int[3];
		arr[0] = 98;
		arr[1] = 99;
		arr[2] = 100;
		for(int i : arr){
			System.out.println(i);
		}
		System.out.println("数组的长度为："+arr.length);
	}
	public void test2(){
		Student[] stus = new Student[3];
		stus[0] = new Student(1001,"terry",12);
		stus[1] = new Student(1002,"lerry",12);

		for(Student stu : stus){
			if(stu != null){
				System.out.println(stu.getName());
			}else{
				System.out.println(stu);
			}
			
		}
	}
}