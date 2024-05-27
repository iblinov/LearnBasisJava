package by.bsu2.exception;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RunMain {

    public static void main(String... args) {
    IntParser obj = new IntParser();

        try {
            int res = obj.method(1, 0);
        } catch (ProjectException e) {
            e.printStackTrace();
        }


    }
}
