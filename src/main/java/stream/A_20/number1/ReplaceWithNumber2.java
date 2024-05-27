package stream.A_20.number1;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReplaceWithNumber2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст:");
        String text = scanner.nextLine();
        System.out.print("Введите номер буквы: ");
        int k = scanner.nextInt();
        System.out.print("Введите символ для замены: ");
        char symbol = scanner.next().charAt(0);
        String result = Stream.of(text.split("\\s+"))
                .map(word -> {
                    if (k <= word.length()) {
                    char[] chars = word.toCharArray();
                    chars[k-1] = symbol;
                    return new String(chars);
                    } else {
                        return word;
                }
           })
            .collect(Collectors.joining(" "));
        System.out.println("Результат: " + result);
    }
}