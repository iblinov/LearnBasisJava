package by.bsu2.map;

import java.util.Arrays;
import java.util.Map;

public class NextRun {
    public static void main(String[] args) {
        StandartTextDivider divider = new StandartTextDivider();
        Map<String, Integer> res = divider.divideTextFromFile("data\\text.txt");
        System.out.println(res);

        String str[] = {"a", "b", "c"};
        for (int i = 0; i < str.length; i++) {
            str[i] += "1";
        }
        System.out.println(Arrays.toString(str));
        for (String s: str) {
            s += "java";
        }
        System.out.println(Arrays.toString(str));
    }
}
