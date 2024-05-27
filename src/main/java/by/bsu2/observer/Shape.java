package by.bsu2.observer;

public class Shape implements ShapeObservable {
  private int x;
  private String description;
  private ShapeObserver observer;
  public Shape(int x) {
    this.x = x;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
    notifyObservers();
  }

  @Override
  public void attach(ShapeObserver observer) {
    this.observer = observer;
  }

  @Override
  public void detach(ShapeObserver observer) {
    observer = null;
  }

  @Override
  public void notifyObservers() {
        if(observer != null) {
          observer.shapeUpdate(new ShapeEvent(this));
        }
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("Shape{");
    sb.append("x=").append(x);
    sb.append(", description='").append(description).append('\'');
    sb.append('}');
    return sb.toString();
  }
}
