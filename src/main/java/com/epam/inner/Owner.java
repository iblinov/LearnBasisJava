package com.epam.inner;
abstract class A {
  abstract void m();
}
public class Owner {
 enum Size{
    SMALL, BIG
  }
  class Inner {}
  static class Nested{}
  A n(){
    class LocalInner extends A{
      @Override
      void m() {
        System.out.println("local");
      }
    }
    LocalInner localInner = new LocalInner();
    return localInner;
  }
}
class Main {
  public static void main(String[] args) {
    Owner.Inner obv1 = new Owner().new Inner();
    Owner.Nested ob = new Owner.Nested();
    Owner owner = new Owner();
    A a = owner.n();
    a.m();
    Owner.Size size = Owner.Size.BIG;
  }
}

