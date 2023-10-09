package course3.A_20;
import java.util.Scanner;
import java.util.Arrays;
public class SumOfIntegersInText3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int sum = Arrays.stream(text.split("\\s+"))
                .filter(word -> word.matches("\\d+"))
                .mapToInt(Integer::parseInt)
                .sum();
        System.out.println("Сумма всех целых чисел в тексте: " + sum);
        scanner.close();
    }
}
