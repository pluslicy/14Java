package com.briup.ch04;
/**
	ѧ���࣬��������ѧ�����洢ѧ������Ϣ
 */
public class Student {
	private long id;
	public String name;
	private int age;

	/**
	  ϵͳĬ�Ϲ��캯��
	*/
	public Student(){
		
	}

	/**
	  ˵��õķ���
	*/
	public void sayHello(){
		System.out.println(this.name+"˵ hello");
	}

	/**
	  �ӷ�����
	*/
	public int add(int a,int b){
		return a+b;
	}

	public void show99(){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"*"+i+" = "+i*j+" ");
			}
			System.out.println();
		}
	}
}