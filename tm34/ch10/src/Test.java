package com.briup.ch10;

/**
*/
public class Test{
	public static void main(String[] args){
		Test test= new Test();
		test.test4();
	}
	//��ά����ĳ�ʼ��
	public void test4(){
		//int[][] arr = {{1,2,3},{3,2},{5,4}};
		int[][] arr = new int[][]{
				new int[]{1,2,3},
				new int[]{3,2}};
		for(int i=0;i<arr.length;i++){
			System.out.print("��"+(i+1)+"�����飺");
			//arr[i]
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}

	}

	public void test3(){
		Student[] stus = new Student[3];
	
	}


	//�����Զ����ʼ��
	public void test2(){
		Student stu = new Student(1001,"terry",12);
		int[] arr = new int[]{6,3,2};

		System.out.println(stu);
		showArray(arr);
	}
	// �����߸���  win10 ������ linux���� touch ls 
	public void test1(){
		Student stu = new Student();
		int[] arr = new int[3];
		System.out.println(stu);
		System.out.println(arr);
		showArray(arr);

	}
	public void showArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}