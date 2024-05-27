package by.bsu2.java8.lambda.stream;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Ihar_Blinou on 6/22/2015.
 */
public class PatternMain {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(":");
        Set<Integer> set = pattern.splitAsStream("1:7:3:9:5:2").mapToInt(Integer::parseInt).boxed().collect(Collectors.toSet());
        set.forEach(System.out::println);
    }
}
