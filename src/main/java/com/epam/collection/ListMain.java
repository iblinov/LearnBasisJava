package com.epam.collection;

import com.epam.thread.port.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ListMain {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("q");
    list.add("4");
    list.add(2, "ret");
    list.remove(0);

    List<Integer> LIST = List.of(2, 4, 7);

    ArrayDeque<String> deque = new ArrayDeque<>();
    deque.peek();
    deque.poll();
    // deque.pop();
    //deque.element();
    PriorityQueue<Integer> queue = new PriorityQueue<>();
    queue.add(5);
    queue.add(7);
    queue.add(6);
    queue.add(3);
    queue.add(1);
    int s = queue.size();
    for (int i = 0; i < s; i++) {
      System.out.println(queue.poll());
    }
    System.out.println(queue);
    Set<Integer> set = new TreeSet<>();
    set.add(5);
    set.add(7);
    set.add(7);
    set.add(3);
    set.add(1);
    System.out.println(set);
    Optional.ofNullable(null);

    List<Integer> integerList = new ArrayList<>(3);
    integerList.add(2, 1);
    integerList.add(1, 2);
    integerList.add(0, 3);
    System.out.println(integerList);

  }
}


