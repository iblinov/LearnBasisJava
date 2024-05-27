package by.bsu2.overriding;

public class SimpleAction {

  final static int MAX_VALUE = 6;
  final static StringBuilder builder = new StringBuilder();
  {
    System.out.println(this.value);
  }
  private int value = 5;

  public SimpleAction() {
    this.doAction();
  }

  public static void doAction(){
    System.out.println(" doAction");
  }
}
