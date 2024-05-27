package by.bsu2.java8.lambda.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EntityMainForeach {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("text/students.txt"))) {
            br.lines().forEach(System.out::println);
        } catch(IOException e) {
           e.printStackTrace();
        }
    }
}
