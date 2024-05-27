package by.bsu2.overriding;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

class Picture{}
public class Main {

  public static void main(String[] args) {

    try {
      FileInputStream stream = new FileInputStream(new File("data\\t.txt"));
      byte[] b = new byte[3];
      int count = stream.read(b);
      System.out.println(count + "    " + Arrays.toString(b));
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
//
//
//    var post = new Post<>();
//    post.setMessage("123");
//    post.setMessage(678);
//    Post post1 = new Post<>();
////    Post<Short, Picture> post2 = new Post<>();
////     post1 = post;
////     post2 = post1;
////     var i = "87089";
//     var s = post.getMessage();
//    System.out.println(s);
//     Picture sb = post2.getMessage();
//    // post = post2;
  }
}
