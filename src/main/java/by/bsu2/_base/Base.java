package by.bsu2._base;
class Item {
  private int value;
  public Item(int value) {
    this.value = 12 / value; //1
  }
  public int getValue() {
    return value; //2
  }
}
public class Base {
  public static void main(String[] args) {
    Item item = null;
    try {
      item = new Item(0); //3
    } catch (Exception e) { //4
      System.out.println(item.getValue()); //5
    }
  }
}
