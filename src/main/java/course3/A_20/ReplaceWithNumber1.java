package course3.A_20;

import java.util.stream.Collectors;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ReplaceWithNumber1 {
    public static void main(String[] args)
    throws IOException {
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(System.in));
            System.out.println("Введите текст");
            String text = reader.readLine();
            String result = text.chars()
                    .mapToObj(c -> (char) c)
                    .map(ch -> {
                        if (Character.isAlphabetic(ch)) {
                            int index = Character.toLowerCase(ch) - 'a' + 1;

                            return String.format("%d  ", index);

//                            return String.format("%d  ", text);
                        } else {
                            return "  ";
                        }
                    })
                    .collect(Collectors.joining());
            System.out.println(text);
            System.out.println(result);
    }
}
