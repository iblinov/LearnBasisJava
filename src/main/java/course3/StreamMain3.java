package course3;
/**
 * 1.В каждом слове текста k-ю букву заменить заданным символом. Если
 * k больше длины слова, корректировку не выполнять.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 *1.В каждом слове текста k-ю букву заменить заданным символом. Если
 *k больше длины слова, корректировку не выполнять.
 */
public class StreamMain3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите текст:");
    String text = scanner.nextLine();
    System.out.println("Введите номер буквы для замены:");
    int k = scanner.nextInt();
    System.out.println("Введите символ для замены:");
    char replacement = scanner.next().charAt(0);
    String result = Arrays.stream(text.split(" ")).map(word -> {
      if (k > word.length()) {
        return word;
      }
      StringBuilder sb = new StringBuilder(word);
      sb.setCharAt(k - 1, replacement);
      return sb.toString();
    }).reduce((acc, word) -> acc + " " + word).orElse("");
    System.out.println("Результат: " + result);
  }
}
    /*
В данном примере сначала считывается текст, номер буквы для замены и символ
для замены с помощью объекта Scanner. Затем текст разбивается на массив слов с помощью метода split, после
чего для каждого слова выполняется замена k-й буквы на заданный символ или возвращается исходное слово,
если k превышает длину слова. Это делается с помощью лямбда-выражения, которое принимает слово в качестве
аргумента и возвращает измененное или исходное слово. Далее результат обратно объединяется в строку с
помощью метода reduce, который
объединяет строки через пробелы. В итоге получаем результирующую строку, которую выводим на экран.
 */



