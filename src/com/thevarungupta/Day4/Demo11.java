package com.thevarungupta.Day4;

class Bike{
    public final void drive(){
        System.out.println("driving...");
    }
}

class Honda extends Bike{
//    @Override
//    public void drive() {
//        System.out.println("not driving...");
//    }
}

public class Demo11 {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.drive();
    }
}
