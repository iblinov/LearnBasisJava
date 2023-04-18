package com.epam.thread;
public class BaseThreadMain {
  public static void main(String[] args) throws InterruptedException {
    Walk walk = new Walk(); // new thread object
    System.out.println(walk.getState());
    Thread talk = new Thread(new Talk()); // new thread object
    System.out.println(talk.getState());
    talk.start(); // start of thread
    walk.start(); // start of thread
    Thread.sleep(20);
    System.out.println(walk.getState());
    System.out.println(talk.getState());
// TalkThread t = new TalkThread(); just an object, not a thread
// t.run(); or talk.run();
// method will execute, but thread will not start!
    System.out.println("end");
    Thread.sleep(1000);
    System.out.println(walk.getState());
    System.out.println(talk.getState());

  }
}
