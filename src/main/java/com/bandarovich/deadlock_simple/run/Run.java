package com.bandarovich.deadlock_simple.run;

import com.bandarovich.deadlock_simple.deadlock.Example;

import java.util.concurrent.TimeUnit;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Example first = new Example("First");
        Example second = new Example("Second");
        new Thread(()-> first.hello(second)).start();
        TimeUnit.SECONDS.sleep(2);
        new Thread(()-> second.hello(first)).start();
    }
}
