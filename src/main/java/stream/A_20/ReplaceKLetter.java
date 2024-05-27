package stream.A_20;

import java.util.Arrays;
import java.io.IOException;
import java.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ReplaceKLetter {
    public static void main(String[] args)
        throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Введите текст");
        String text = reader.readLine();
        System.out.println("Введите k");
        String kStr = reader.readLine();

        int k = Integer.parseInt(kStr);
        System.out.println("Введите символ");
        char replacement = (char) System.in.read();

        String result = Arrays.stream(text.split("\\s+")) //Разбиваем текст на слова
                .map(word -> {
                    if (word.length() >= k) {
                        return word.substring(0, k - 1) + replacement + word.substring(k); //Применяем lambda-выражение
                    } else {
                        return word;
                    }
                })
                .collect(Collectors.joining(" ")); //Склеиваем слова обратно
        System.out.println(result);
    }
}
