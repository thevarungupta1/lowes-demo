package com.thevarungupta.Day4;

class Car{
    private final int speedLimit = 50;

    public void drive(){
        //speedLimit = 70;
        System.out.println("car is driving at speed of "+ speedLimit);
    }
}

public class Demo9 {
    public static void main(String[] args) {
        Car car = new Car();
        //car.speedLimit = 60;
        car.drive();
    }
}
