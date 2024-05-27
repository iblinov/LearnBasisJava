package stream.A_20;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class SumOfIntegersInText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        int sum = calculateSumOfIntegersInText(text);
        System.out.println("Сумма всех целых чисел в тексте: " + sum);
    }

    public static int calculateSumOfIntegersInText(String text) {
        int sum = 0;
        Pattern pattern = Pattern.compile("\\b\\d+\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String group = matcher.group();
            try {
                int number = Integer.parseInt(group);
                sum += number;
            } catch (NumberFormatException ignored) {

            }
        }
        return sum;
    }
}
