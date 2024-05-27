package com.epam.collection;

import com.epam.learn.edu.entity.Student;
import com.epam.thread.port.ConnectionPool;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class ListMain {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("q");
    list.add(null);
    list.add("4");
    list.add(2, "rest");
    list.remove(0);
    list.add(null);
    list.sort(Comparator.nullsLast(String::compareTo));
//    list.stream()
//            .sorted(Comparator.nullsLast(String::compareTo))
//            .forEach(System.out::println);
    System.out.println(list);


    List<Integer> LIST = List.of(2, 4, 7);
   // LIST.add(8);
    List<Integer> integerList = new ArrayList<>(3);
    integerList.add(0, 1);
    integerList.add(1, 2);
    integerList.add(1, 3);
    System.out.println(integerList);
    Iterator<Integer> iterator = integerList.iterator();
    integerList.add(7);
    integerList.remove(0);
    while (iterator.hasNext()) {
      iterator.next();
    }

//    ArrayDeque<String> deque = new ArrayDeque<>();
//    deque.peek();
//    deque.poll();
//    // deque.pop();
//    //deque.element();
//    PriorityQueue<Integer> queue = new PriorityQueue<>();
//    queue.add(5);
//    queue.add(7);
//    queue.add(6);
//    queue.add(3);
//    queue.add(1);
//    int s = queue.size();
//    for (int i = 0; i < s; i++) {
//      System.out.println(queue.poll());
//    }
//    System.out.println(queue);
//    Set<Integer> set = new TreeSet<>();
//    set.add(5);
//    set.add(7);
//    set.add(7);
//    set.add(3);
//    set.add(1);
//    System.out.println(set);
//    Optional.ofNullable(null);
//


  }
}


