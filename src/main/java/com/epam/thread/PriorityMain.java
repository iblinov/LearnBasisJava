package com.epam.thread;

public class PriorityMain {
  public static void main(String[] args) {
    Thread walkMin = new Thread(new Walk(), "Min");
    Thread talkMax = new Thread(new Talk(), "Max");
    walkMin.setPriority(Thread.MIN_PRIORITY);
    talkMax.setPriority(Thread.MAX_PRIORITY);
    talkMax.start();
    walkMin.start();
  }
}

