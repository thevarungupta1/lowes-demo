package com.thevarungupta.Day4;

class Student{
    public int rollNumber;
    public String name;
    static String schoolName = "ABC School";
}


public class Demo4 {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.rollNumber = 1;
        student1.name = "Mark";

        Student student2 = new Student();
        student2.rollNumber = 2;
        student2.name = "Paul";

        System.out.println("Student Id: "+ student1.rollNumber+", Name: "+ student1.name+", School: "+ Student.schoolName );

        System.out.println("Student Id: "+ student2.rollNumber+", Name: "+ student2.name+", School: "+ Student.schoolName );
    }
}
