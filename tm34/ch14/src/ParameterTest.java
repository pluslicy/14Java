package com.briup.ch14;

public class ParameterTest {
   static void increment(int a) { 
		++a;
   }
   static void changeName(Student s) { 
	   s.setName("Larry"); 
   }
   static void changeStudent(Student s) { 
	   s = new Student(1001,"Mary", 20);
   }
   
   public static void main(String[] args) {
	   Student s = new Student(1001,"larry",13);
       System.out.println("before changeStudent() " + s);
       changeStudent(s);
       System.out.println("after changeStudent() " + s);
      
       /*
       Student s = new Student(1001,"larry",13);
       System.out.println("before changeName() " + s);
       changeName(s);
       System.out.println("after changeName() " + s);

       int i = 3;
       System.out.println("before increment() " + i);
       increment(i);
       System.out.println("after increment() " + i);

       
	   */
   }
}
