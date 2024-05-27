package by.bsu2.observer;

public class ShapeObserverImpl implements ShapeObserver {
  @Override
  public void shapeUpdate(ShapeEvent event) {
    Shape shape= event.getSource();
    int x = shape.getX();
    int result = 2*x;

  }
}
