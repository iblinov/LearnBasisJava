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
    return integers.stream().mapToInt(x -> x).sum();
  }
}
