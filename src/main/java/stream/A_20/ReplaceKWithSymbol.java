package stream.A_20;

import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class ReplaceKWithSymbol {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Введите текст: ");
  String text = scanner.nextLine();
  System.out.print("Введите номер: ");
  int k = scanner.nextInt();
  System.out.print("Введите символ для замены: ");
  char replacement = scanner.next().charAt(0);
  String result = replaceCharacter(text, k, replacement);
  System.out.print("Результат: " + result);


}
public static String replaceCharacter(String text, int k, char replacement) {
    String[] words = text.split(" ");
    return IntStream.range(0, words.length)
            .mapToObj(i -> {
                String word = words[i];
                if (k<=word.length()) {
                    return word.substring(0, k-1) + replacement + word.substring(k);

                } else {
                    return word;
                }
            })
            .collect(Collectors.joining(" "));

    }
}
