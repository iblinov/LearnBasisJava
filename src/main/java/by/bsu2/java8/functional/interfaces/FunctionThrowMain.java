package by.bsu2.java8.functional.interfaces;

import java.io.IOException;

public class FunctionThrowMain {
    static void m(FunctionThrow<String, String, IOException> fun) {

    }
    public static void main(String[] args) {
        FunctionThrow<String, String, IOException> fun = (r) -> r;
        m(fun);
    }
}
