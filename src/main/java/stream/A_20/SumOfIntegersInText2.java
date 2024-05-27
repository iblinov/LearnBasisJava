package stream.A_20;
import java.util.Scanner;

public class SumOfIntegersInText2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int sum = calculateSumOfIntegersInText(text);
        System.out.println("Сумма всех целых чисел в тексте: " + sum);
        scanner.close();

    }
    public static int calculateSumOfIntegersInText(String text) {
        int sum = 0;
        String[] words = text.split("\\s+");
        for (String word: words) {
            try {
                int number = Integer.parseInt(word);
                sum += number;
            } catch (NumberFormatException ignored) {

            }
        }
        return sum;
    }
}
