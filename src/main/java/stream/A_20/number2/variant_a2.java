package stream.A_20.number2;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class variant_a2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        String letters = Stream.of(text.split(""))
                .map(c -> c.toUpperCase())
                .filter(c -> c.matches("[A-ZА-Я]"))
                .map(c -> c + " ")
                .collect(Collectors.joining(""));
        String numbers = Stream.of(text.split(""))
                .map(c -> c.toLowerCase())
                .filter(c -> c.matches("[a-z]"))
                .map(c -> ((int) c.charAt(0) - 96) + " ")
                .collect(Collectors.joining(""));
        System.out.println(letters);
        System.out.println(numbers);
    }
    }
