package by.bsu2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Deadlock {

  public static void main(String[] args) {
    Runner runner = new Runner();

    Thread thread1 = new Thread(new Runnable() {
      @Override
      public void run() {
        runner.firstThread();
      }
    });

    Thread thread2 = new Thread(new Runnable() {
      @Override
      public void run() {
        runner.secondThread();
      }
    });
    thread1.start();
    thread2.start();

    try {
      thread1.join();
      thread2.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    runner.finished();
  }
}


class Runner{
  private Account account1 = new Account();
  private Account account2 = new Account();

  Lock lock1 = new ReentrantLock();
  Lock lock2 = new ReentrantLock();

  public void takenLock(Lock lock1, Lock lock2){
    boolean checkLock1 = false;
    boolean checkLock2 = false;
    while (true){
    try{
      checkLock1 = lock1.tryLock();
      checkLock2 = lock2.tryLock();
    } finally {
      if(checkLock1 && checkLock2){
        return;
      }

      if(checkLock1){
        lock1.unlock();
      }

      if(checkLock2){
        lock2.unlock();
      }}
    }
  }

  public void firstThread(){
    Random random = new Random();

    for (int i = 0; i < 50000; i++) {
      takenLock(lock1, lock2);
      try {

        Account.transfer(account1, account2, random.nextInt(100));
      } finally {
        lock1.unlock();
        lock2.unlock();
      }
    }
  }

  public void secondThread(){
    Random random = new Random();

    for (int i = 0; i < 50000; i++) {
      takenLock(lock2, lock1);

      try {
        Account.transfer(account2, account1, random.nextInt(100));
      } finally {
        lock2.unlock();
        lock1.unlock();
    }
  }}


  public void finished(){
    System.out.println(account1.getBalance());
    System.out.println(account2.getBalance());
    System.out.println("Total:" + (account1.getBalance() + account2.getBalance()));
  }
}

class Account{

  private int balance = 10000;

  public void deposit(int amount){
    balance += amount;
  }

  public void withdraw(int amount){
    balance -= amount;
  }

  public int getBalance(){
    return balance;
  }

  public static void transfer(Account account1, Account account2, int amount){
    account1.withdraw(amount);
    account2.deposit(amount);
  }
}
