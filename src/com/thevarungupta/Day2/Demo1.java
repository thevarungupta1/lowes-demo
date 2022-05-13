package com.thevarungupta.Day2;

class Test {
    static int y = 100; // static variable
    int x = 10;  // instance variable

    public void addNumber() {
        // static int b = 200;  not allowed
        int a = 10; // local variable
    }

    public void foo() {
        //System.out.println(a);
        System.out.println(x);
        System.out.println(y);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Test obj = new Test();
        System.out.println(obj.x);
        obj.addNumber();
        obj.foo();
        System.out.println(Test.y);
    }
}
