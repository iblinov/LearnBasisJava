package com.epam.thread;

import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class CopyOnWriteMain {
  public static void main(String[] args) {
    List<Integer> temp = new Random()
            .ints(5, 0, 10)
            .boxed()
            .collect(Collectors.toList());
    List<Integer> copyList = new ArrayList<>(temp);
//    CopyOnWriteArrayList<Integer> copyList = new CopyOnWriteArrayList<>(temp);
    System.out.printf("%17s: %s%n ", "copyList before", temp);

    new Thread(() -> { // thread # 1
      try {
        TimeUnit.MILLISECONDS.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      Iterator<Integer> iterator = copyList.iterator();
      while (iterator.hasNext()) {
        Integer current = iterator.next();
        copyList.add(current);
      }
      System.out.printf("%16s: %s%n ", "copyList Th #1", copyList);
    }).start();
    new Thread(() -> { // thread # 2
      for (int i = 0; i < 10; i++) {
        try {
          TimeUnit.MILLISECONDS.sleep(10);// change to 100
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        copyList.add(i);
      }
    }).start();
    try {
      TimeUnit.SECONDS.timedJoin(Thread.currentThread(), 1);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.printf("%16s: %s%n ", "copyList Th #2", copyList);
   // System.out.printf("%16s: %s%n ", "newList Th #1", newList);
  }

}
