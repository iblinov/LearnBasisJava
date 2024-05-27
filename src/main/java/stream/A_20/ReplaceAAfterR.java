package stream.A_20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.Collectors;



public class ReplaceAAfterR {
    public static void main(String[] args)
        throws IOException {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Введите текст");
            String text = reader.readLine();
            String result = Arrays.stream(text.split("\\s+")) // Разбиваем текст на слова с пом. split и регулярки \\s+,  которая означает "один или несколько пробельных символов"
                    .map(word -> {
                        StringBuilder builder = new StringBuilder();
                        for (int i = 0; i < word.length(); i++) {
                            char ch = word.charAt(i);
                            builder.append(ch);
                            if (i < word.length() - 1 && ch == 'r' || ch == 'R') {
                                char nextCh = word.charAt(i + 1);
                                if (nextCh == 'a' || nextCh == 'A') {
                                    builder.append('o');
                            }
                        }
                    }
                    return builder.toString();
                    })
            .collect(Collectors.joining(" "));
            System.out.println(result);
    }
}
