package com.thevarungupta.Day4;

// without static
//class Counter{
//    int count = 0;
//
//    public Counter(){
//        count++;
//        System.out.println(count);
//    }
//}

// with static
class Counter{
    static int count = 0;

    public Counter(){
        count++;
        System.out.println(count);
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
    }
}
