package com.briup.ch10;

public class Test {
	public static void main(String[] args){
		Test test = new Test();
		test.test1();
	}
	public void test1(){
		//����һά����
		//int[] arr = new int[];
		/*
		int[][] arr = new int[3][];
		arr[0] = new int[]{1,2,3};	//1,2,3
		arr[1] = new int[2];		//0,0
		arr[2] = new int[]{8};		//8
		*/
		//int[] arr = new int[]{1,2,3};
		/*
		int[][] arr = new int[][]{
				new int[]{1,2,3},
				new int[2],
				new int[]{8}
				};
		*/
		//int[] arr = {1,2,3};
		int[][] arr = {{3,2,1},{0,0},{8}};
		for(int i=0;i<arr.length;i++){
			System.out.print("��"+(i+1)+"�����飺");
			//arr[i]  һά����
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/*
			i=0;i<3 true;
				��1������:
				j=0;j<3 true; arr[0][0] "1,"
				j=1;j<3 true; arr[0][1] "2,"
				j=2;j<3 true; arr[0][2] "3,"
				j=3;j<3 false;
				"\n" ����
			i=1;i<3 true;
				j=0;j<2 true; arr[1][0] "0,"
				j=1;j<2 true; arr[1][1] "0,"
				j=2;j<2 false;
				"\n" ����
			i=2;i<3 true;
				j=0;j<1 true; arr[2][0] "8,"
				j=1;j<1 false
				"\n"����
			i=3;i<3 false
				����
		*/
	}
}