package by.bsu2.observer;

import java.util.EventObject;

public class ShapeEvent extends EventObject {
  /**
   * Constructs a prototypical Event.
   *
   * @param source the object on which the Event initially occurred
   * @throws IllegalArgumentException if source is null
   */
  public ShapeEvent(Object source) {
    super(source);
  }

  @Override
  public Shape getSource() {
    return (Shape)super.getSource();
  }
}
