package com.briup.ch13;

public class Test {
   
   
  

   public static void increment(int a) { 
		++a;//3
   }
   public static void changeName(Student s) { 
		s.setName("Larry"); 
   }
   public static void changeStudent(Student s) { 
	   s = new Student(1001,"Mary",20); 
   }
   public static void main(String[] args) {
	   s = new Student(1001,"zhao",12);
       System.out.println("before changeStudent() " + s);
       changeStudent(s);
       System.out.println("after changeStudent() " + s);
	   /*
       int i = 2;
       System.out.println("before increment() "+i);//2
       increment(i);
       System.out.println("after increment() "+i);
	   
       Student s = new Student(1001, "terry", 18);
       System.out.println("before changeName() " + s);
       changeName(s);
       System.out.println("after changeName() " + s);
	   */
      
      
   }
}
