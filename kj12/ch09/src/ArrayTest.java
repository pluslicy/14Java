package com.briup.ch09;

public class ArrayTest {
	public static void main(String[] args){
		ArrayTest test = new ArrayTest();
		test.test3();
	}
	
	public void test3(){
		//����С���Ա����Ϣ
		Student stu1 = new Student(1001L,"terry",12);
		Student stu2 = new Student(1002L,"larry",13);
		Student stu3 = new Student(1003L,"jacky",19);
		Student stu4 = new Student(1004L,"tom",11);
		Student stu5 = new Student(1005L,"vicky",9);

		//���浽������
		Student[] stus= new Student[]{stu1,stu2,stu3,stu4,stu5};

		//����
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i]);
		}
	
	}

	public void test2(){
		//int[] arr = new int[5];
		//int[] arr = new int[]{1,2,3,4,5};
		//���⣬ֻ���������ͳ�ʼ����һ���ʱ������
		int[] arr = {4,12,34,4,5};
		showArray(arr);
	}

	public void test1(){
		//��ʾ5���˵�����
		//���������
		int[] ages;
		//��ʼ��
		/*
		ages = new int[5];
		ages[0] = 21;
		ages[1] = 21;
		ages[2] = 22;
		ages[3] = 20;
		ages[4] = 21;
		*/
		ages= new int[]{21,21,22,20,21};
		/*
		System.out.println(ages[0]);
		System.out.println(ages[1]);
		System.out.println(ages[2]);
		System.out.println(ages[3]);
		System.out.println(ages[4]);
		*/
		showArray(ages);
	}



	


	public void showArray(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}