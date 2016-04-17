package com.briup.ch10;

public class Test {
	public static void main(String[] args){
		Test test =new Test();
		test.test2();
	}
	public void test2(){
		int[][] arr = new int[3][];
		arr[0] = new int[]{9,1,2};
		arr[1] = new int[2];
		arr[2] = new int[3];
		for(int i=0;i<arr.length;i++){
			// arr[i] 就是在第一个数组维度中保存的数组
			System.out.print("第"+(i+1)+"个维度：");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/*
			i=0;i<3 true;"第1个维度："
			    j=0;j<3 true;arr[0][0] "9"
				j=1;j<3 true;arr[0][1] "1" 
				j=2;j<3 true;arr[0][2] "2"
				j=3;j<3 false
			i=1;i<3 true:"第2个维度"
				j=0;j<2 true;arr[1][0] "0"
				j=1;j<2 true;arr[1][1] "0"
				j=2;i<2 false;
			i=2
			
		*/
	}
	public void test1(){
		Student stu = new Student();
		int[] arr = new int[5];

		Student[] stus = new Student[3];
		stus[0] = new Student();
		stus[1] = new Student();
		stus[2] = new Student(1001,"tom",12);

		System.out.println(stu);
		System.out.println(arr);
		System.out.println(stus);

		

	}
}