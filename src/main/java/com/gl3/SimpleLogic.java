package com.gl3;

public class SimpleLogic {

    public int m1(int x) {
        int count=1;
        try {
            count += x;
            count += m2(count);
        }
        finally {
            count++;
            count += 3;
        }
        count++;
        return count;
    }
    public int m2(int x) {
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        SimpleLogic X = new SimpleLogic();

    }

}
