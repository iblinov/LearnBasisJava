package by.bsu2.overriding;

public class ExtendedAction extends SimpleAction {
  public ExtendedAction() {
    this.doAction();
  }


  public static void doAction() {
    System.out.println(42);
  }
}
