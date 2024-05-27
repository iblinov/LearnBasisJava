package by.bsu2.io;

import java.io.*;

public class WriterDemo {
  public static void main(String[] args) {
//    try(PrintWriter writer =
//            new PrintWriter(
//                    new BufferedWriter(
//                            new FileWriter("data\\t.txt")
//                    ))
//            ){
//      writer.println(123);
//      writer.print("java");
//      writer.printf("%d", 67890);
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    try {
      PrintStream stream = new PrintStream(
             ("data\\t.txt")              );
      stream.println(1000);
      System.setOut(stream);
      System.out.println("bla bla" + 123);
      Console console = System.console();
      System.out.println(console);
    //  System.out.println(12367);
//      ProcessBuilder process = new ProcessBuilder();
//      process.command("mspaint", "c:\\bel_ukr.jpg");
//      process.start();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
