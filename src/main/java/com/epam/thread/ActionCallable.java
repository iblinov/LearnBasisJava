package com.epam.thread;
import java.util.List;
import java.util.concurrent.Callable;
public class ActionCallable implements Callable<Integer> {
  private List<Integer> integers;
  public ActionCallable(List<Integer> integers) {
    this.integers = integers;
  }
  @Override
  public Integer call() {
    int sum = 0;
    for (int number : integers) { sum += number;
    }
    return sum;
  }
}
