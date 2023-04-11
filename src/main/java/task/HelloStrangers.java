package task;

import java.util.Scanner;

public class HelloStrangers {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("How many strangers do you want to meet? ");
      int numStrangers = -1;
      while(scanner.hasNextInt()) {
         numStrangers = scanner.nextInt();
         break;
      }
      if (numStrangers == 0) {
        System.out.println("Oh, it looks like there is no one here");
      } else if (numStrangers < 0) {
        System.out.println("Seriously? Why so negative?");
      } else {
        String[] names = new String[numStrangers];
       scanner.nextLine();
        for (int i = 0; i < numStrangers; i++) {
          names[i] = scanner.nextLine();
        }
        for (int i = 0; i < numStrangers; i++) {
          System.out.println("Hello, " + names[i]);
        }
      }
    }
    }
  }

