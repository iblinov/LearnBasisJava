package stream;

import java.util.*;
/**
 *1.В каждом слове текста k-ю букву заменить заданным символом. Если
 *k больше длины слова, корректировку не выполнять.
 */

public class StreamMain3_1 {

    public static void main(String[] args) {

        System.out.println("Enter text string");
        Scanner sc1 = new Scanner(System.in);
        String text = sc1.nextLine();
        String[] strArr = text.split(" ");

        System.out.println("Enter number");
        int n = 0;
        Scanner sc2 = new Scanner(System.in);
        try {
            n = sc2.nextInt();
        } catch (InputMismatchException fg) {
            System.out.print("Not number");
            return;
        }

        System.out.println("Enter symbol");
        Scanner sc3 = new Scanner(System.in);
        char symbol = sc3.next().charAt(0);

        for (int i = 0; i < strArr.length; i++) {


            String newStrArr[] = new String[strArr.length];
            if (strArr[i].length() > n) {
                newStrArr[i] = strArr[i].substring(0, n) + symbol + strArr[i].substring(n + 1);
            } else {
                newStrArr[i] = strArr[i];
            }
            System.out.println(newStrArr[i]);
        }

    }
}