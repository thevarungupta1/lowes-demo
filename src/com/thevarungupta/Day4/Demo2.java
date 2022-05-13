package com.thevarungupta.Day4;

class Parent{
    public Parent(int a){
        System.out.println("parent constructor: "+ a);
    }

    public void parentMethod(){
        System.out.println("parent method");
    }
}

class Child extends Parent{
    public Child(int a){
        super(a);
        System.out.println("child constructor");
    }

    public void childMethod(){
        System.out.println("child method");
    }
}

public class Demo2 {
    public static void main(String[] args) {
        //Parent p = new Parent();
        Child c = new Child(100);
        c.childMethod();
        c.parentMethod();

        Parent p = new Parent(100);
        p.parentMethod();


    }
}
