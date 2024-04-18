package hamlet;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

public class Hamlet {
  public static void main(String[] args) {
    System.out.println("1 — eng\n 2 — bel\n any — default");
    char i = 0;
    try {
      i = (char)System.in.read();
    } catch (IOException e) {
      e.printStackTrace();
    }
    String country = "";
    String language = "";
    switch (i) {
      case '1':
        country = "US";
        language = "en";
        break;
      case '2':
        country = "BY";
        language = "be";
    }
    Locale current = new Locale(language, country);
    ResourceBundle rb = ResourceBundle.getBundle("res.sweetdata2", current);
    String s1 = rb.getString("submit1");
    System.out.println(s1);
    String s2 = rb.getString("submit2");
    System.out.println(s2);
  }
}
