package com.briup.ch10;

/**
*/
public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	public void test3(){
		int[][] arr = new int[3][3];
		//arr[0] =new int[3];
		//arr[1] =new int[]{1,2,3};
		//arr[2] =new int[]{9,9};

		for(int i=0;i<arr.length;i++){
			//arr[i] ����
			System.out.print("��"+(i+1)+"��ά��");
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+",");
			}
			System.out.println();
		}
		/**
			i=0;i<3 true;
			  "��1��ά��"
			  j=0;j<3 true;arr[0][0];  "0"
			  j=1;j<3 true;arr[0][1];  "0"
			  j=2;j<3 true;arr[0][2];  "0"
			  j=3;j<3 false		"\n"
			i=1;i<3 true;
			  "��2��ά"
			  j=0;j<3 true;arr[1][0];	"1"
			  j=1;j<3 true;arr[1][1];	"2"
			  j=2;j<3 true;arr[1][2];	"3"
			  j=3;j<3 false;	"\n"
			i=2;i<3 true;
			   "��3��ά"
			  j=0;j<2 true;arr[2][0];	"9"
			  j=1;j<2 true;arr[2][1];	""
			  j=2;i<2 false;	"\n"
		    i=3;i<3 false;
			��������
		 */
	}
	public void test2(){
		//��ʼ����һ��ѧ�����飨�����б���ѧ���ģ�
		Student[] stus = new Student[3];
		stus[0] = new Student();
		stus[1] = new Student(1001,"tom",12);
		stus[2] = new Student(1002,"jacky",13);
		for(int i=0;i<stus.length;i++){
			System.out.println(stus[i].name);
		}

	}
	public void test1(){
		//��ʼ����һ��int���飨�����б���������
		int[] arr = new int[]{5,6,2,3,1};
		System.out.println("���鳤��Ϊ��"+arr.length);
		System.out.println(arr);
		
		//�����߸��� dos ����ֱ�ӵ���linux���� 
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}