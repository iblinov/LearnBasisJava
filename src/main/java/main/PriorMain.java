package main;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorMain {

  public static void main(String[] args) {
    Comparator<String> comparator = ( o1,  o2) -> o2.charAt(0) - o1.charAt(0);

    Queue<String> queue = new PriorityQueue<>(comparator);
    queue.add("c");
    queue.add("b");
    queue.add("h");
    queue.add("e");
    queue.add("d");
    queue.add("a");
    queue.add("d");
    queue.add("b");
    int size = queue.size();
    System.out.println(queue.size());
    System.out.println(queue);
    for (int i = 0; i < size; i++) {
      System.out.println(queue.poll());
    }
  }
}
