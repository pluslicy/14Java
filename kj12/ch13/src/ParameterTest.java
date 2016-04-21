package com.briup.ch13;

public class ParameterTest {
   public static void increment(int a) {
	   ++a;
   }
   public static void changeName(Student s) {
	   s.setName("Larry"); 
   }
   public static void changeStudent(Student s) {
	   s = new Student(1001L, "Larry", 20); 
   }
   
   public static void main(String[] args) {

	   Student s = new Student(1001L,"zhao", 18);
       System.out.println("before changeStudent() " + s);
       changeStudent(s);
       System.out.println("after changeStudent() " + s);
	   /*
	   Student s = new Student(1001L,"zhao",18);
       System.out.println("before changeName() " + s);
       changeName(s);
       System.out.println("after changeName() " + s);
	   
       int i = 2;
       System.out.println("before increment() " + i);
       increment(i);
       System.out.println("after increment() " + i);
       
     
       
       
	   */
   }
}
