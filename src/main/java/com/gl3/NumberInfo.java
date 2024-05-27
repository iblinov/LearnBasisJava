package com.gl3;

public class NumberInfo {
    public void viewNum(Integer i) { // 1
        System.out.printf("Integer=%d%n", i);
    }
    public void viewNum(int i) { // 2
        System.out.printf("int=%d%n", i);
    }
    public void viewNum(Float f) { // 3
        System.out.printf("Float=%.4f%n", f);
    }
    public void viewNum(Number n) { // 4
        System.out.println("Number=" + n);
    }
}
