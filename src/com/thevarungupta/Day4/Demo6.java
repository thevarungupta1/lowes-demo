package com.thevarungupta.Day4;

class Calculator{
    // non-static method
    public void addNumber(int a, int b){
        System.out.println(a + b);
    }

    // static method
    public static void subNumber(int a, int b){
        System.out.println(a - b);
    }
}

public class Demo6 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addNumber(100, 50);
        Calculator.subNumber(100, 50);

    }
}
