package com.briup.ch11;
import java.util.Scanner;
public class Test{
	public static void main(String[] args){
		Test test = new Test();
		test.test3();
	}
	//���鿽��
	public void test3(){
		int[] arr = new int[]{9,3,3,4};
		int[] arr2 = new int[8];
		//���鿽��
		System.arraycopy(arr,2,arr2,3,arr.length-2);
		//��ӡ����
		showArray(arr);
		showArray(arr2);
	}	
	//��װ�˴�ӡ����ķ���
	public void showArray(int[] arr){
		for(int i : arr){
			System.out.print(i+",");
		}
		System.out.println();
	}
	public void test2(){
		String info = "1001#terry#12";
		String[] arr = info.split("#");

		String idStr = arr[0];
		String name= arr[1];
		String ageStr = arr[2];
		//��װΪStudent���� long id,String name,int age



	}
	//���Դӱ�׼�����л�ȡ�û�������
	public void test1(){
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("������������");
			//������ɴ����������ֱ���û�����س�
			String i = sc.nextLine();
			System.out.println("i:"+i);
		}
	}
}