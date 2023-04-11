package com.epam.thread;

public class Test{
  public static void main(String []a) {
    new VolThread().start();
    new VolThread().start();
  }}
class VolThread extends Thread {
  volatile static int x;
  public void run(){
    while(x < 3){
      System.out.print(x);
      x++;
    }}}
