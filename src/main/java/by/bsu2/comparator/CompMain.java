package by.bsu2.comparator;

import by.bsu2.observer.Shape;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class CompMain {
  public static void main(String[] args) {
    Comparator<Shape> comp1 = new Comparator<Shape>() {
      @Override
      public int compare(Shape o1, Shape o2) {
        return o1.getX() - o2.getX();
      }
    };
    Comparator<Shape> comp2 = (Shape o1, Shape o2) -> {
      return o1.getX() - o2.getX();
    };
    Comparator<Shape> comp3 = (o1, o2) -> {
      return o1.getX() - o2.getX();
    };
    Comparator<Shape> comparator = (o1, o2) -> o1.getX() - o2.getX();
    Function<Shape, Integer> comparator2 = Shape::getX;

    //   comparator.thenComparing((o1, o2) -> o1.getDescription().compareTo(o2.getDescription()));
    Comparator.comparing(Shape::getX).thenComparing(Shape::getDescription);
    ArrayList<Shape> list = new ArrayList<>();
    /// fill
    list.sort(comparator);
    Collections.sort(list, comparator);
  }
}
