package com.bandarovich.deadlock_simple.deadlock;

public class Example {
    private String name;

    public Example(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public synchronized void hello(Example example){
        System.out.println(name + " says hello to " + example.getName());
        example.bye();
    }
    private synchronized void bye(){

        System.out.println(name + " says bye");
    }
}
