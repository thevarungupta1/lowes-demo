package com.thevarungupta.Day3;

public class Demo3 {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("end");
    }
}
