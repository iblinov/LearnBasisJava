package by.bsu2.observer;

public interface ShapeObservable {
  void attach(ShapeObserver observer);
  void detach(ShapeObserver observer);
  void notifyObservers();
}
