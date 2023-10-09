package course3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 4.	В тексте после k-го символа вставить заданную подстроку.
 */
public class StreamMain3_4 {
    public static void main(String... args){
        String str = "The quick brown fox jumps over the lazy dog.";
        int k = 10;
        String substr = "yellow ";

        String result = IntStream.range(0, str.length())
                .mapToObj(i -> i == k ? substr + str.charAt(i) : String.valueOf(str.charAt(i)))
                .collect(Collectors.joining());

        System.out.println(result);
    }
}
    /*
Здесь мы сначала задаем изначальную строку `str`, номер символа `k`, после которого
 мы будем вставлять подстроку, и саму подстроку `substr`.

Затем мы создаем поток чисел от `0` до `str.length()`.
Для каждого индекса символа `i` мы создаем новую строку, используя лямбда-выражение.
 Если индекс символа равен `k`, то мы вставляем подстроку перед этим символом, иначе - просто добавляем
 нужный символ. Наконец, мы собираем все строки в итоговую строку с помощью метода `joining()`.
 */