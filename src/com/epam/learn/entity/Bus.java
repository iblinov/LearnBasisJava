package com.epam.learn.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class Bus {
    private int id = 1;
    final static int COUNTER;

    {
        ++id;
        System.out.println(id);
    }

    static {
        COUNTER = Integer.parseInt("177");
        System.out.println("static block " + COUNTER);
    }

    public Bus(int id) {
        this.id = id;

    }

    public Bus() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bus bus = (Bus) o;

        return id == bus.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Bus.class.getSimpleName() + "[", "]")
                .add("id=" + id)
                .toString();
    }
}
 class SingletonWareHouse {
    private static SingletonWareHouse instance;
    private List<String> strings = new ArrayList<>();
    private SingletonWareHouse () {

        // init list of strings
    }
     private SingletonWareHouse (int paramInit) {
         // init list of strings
     }

     public static SingletonWareHouse getInstance() {
         if (instance == null) {
             instance = new SingletonWareHouse();
         }
         return instance;
     }

     public static SingletonWareHouse getInstance(int paramInit) {
         if (instance == null) {
             instance = new SingletonWareHouse(paramInit);
         }
         return instance;
     }
    public void add(String str) {
        // code
    }
    public void remove(String str) {
        // code
    }
    public boolean contains(String str) {
        boolean match = true;
        // code
        return match;
    }
}
