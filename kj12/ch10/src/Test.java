package com.briup.ch10;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test2();
	}
	/**
		��ά����
	 */
	public void test2(){
		//��ʼ����һά���飬һά���鳤��Ϊ3��һά������Ҫ���������
		
		int[][] arr = new int[3][];
		arr[0] = new int[]{1,2,3,4};
		arr[1] = new int[2];
		arr[2] = new int[]{4,2};
		for(int i=0;i<arr.length;i++){
			System.out.print("��"+(i+1)+"�����飺");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/*i=0;true;"��1������"
		      j=0;true;
			    arr[0][0]	"1,"
			  j=1;true;
			    arr[0][1]   "2,"
			  j=2;true;
			    arr[0][1]   "3,"
			  j=3;true;
			    arr[0][1]   "4,"
		  i=1;true;"��2������"	
		      j=0;true
			    arr[1][0]   "0"
			  j=1;true
			    arr[1][1]   "0"
          i=2;

		*/

		//int[][] arr = new int[3][2];

	}
	public void test1(){
		/*
		Student[] stus = new Student[3];//ϵͳ��ʼ��
		stus[0] = new Student(1001,"terry",12);
		stus[1] = new Student(1002,"jacky",12);
		Student stu = new Student(1003,"tom",12);
		stus[2] = stu;
		*/
		Student[] stus = new Student[]{
			new Student(1001,"terry",12),
			new Student(1002,"jacky",12),
		    new Student(1003,"tom",12)	
		};


		//��ǿforѭ��
		for(Student s : stus){
			System.out.println(s);
		}
	}
}