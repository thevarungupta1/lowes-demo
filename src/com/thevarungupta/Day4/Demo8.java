package com.thevarungupta.Day4;

class A10{
    static int a;

    static {
        a = 20;
        System.out.println(a);
    }

    public void test(){
        System.out.println(a);
    }
}

public class Demo8 {
    public static void main(String[] args) {
        A10 obj = new A10();
        obj.test();
    }
}
