package test;

//public class T3 {
//  public static int anInt = 3;   // line1
//  public void T3(int anInt) { // line2
//    this.anInt = anInt;
//  }
//  public static void main(String[] args) {
//    System.out.print(new T3(7).anInt); // line3
//  }
//}

class T4 {
  public static int anInt = 123;   // line1
  public T4(int anInt) { // line2
    this.anInt = anInt;
  }
  public static void main(String[] args) {
    System.out.print(new T4(45).anInt); // line3
  }
}