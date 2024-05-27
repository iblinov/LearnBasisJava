package com.gl3;


class Quest {
    public static void main(String[] args) {
        byte x = 42;
        float y = 12;
        x /= y;
        System.out.println(x);
        RotatableObject.TRIANGLE.rotate();
        RotatableObject.RECTANGLE.rotate();
    }
}
interface Rotatable{
    void rotate();
}
enum RotatableObject implements Rotatable {
    TRIANGLE,
    RECTANGLE;
    public void rotate() {
        System.out.print(this.ordinal());
    }
}
class Generic<T> {
    private T value;
    public void setValue(T value){
        value = value;
    }
}
public class Simple {
    public static void main(String[] args) {
        for (int i=0; i<5; i++){
            switch (i){
                case 0:
                    System.out.print("0");
                    ++i;
                    break;
                case -1:
                    System.out.print("-1");
                    break;
                case 2:
                    System.out.print("2");
                    i++;
                case 4:
                    System.out.print("4");
                    break;
            }
        }
    }
    static void method(int i){
        System.out.println("Primitive Type call");
    }
    static void method(Integer i){
        System.out.println("Wrapper Type Call");
    }
}
class ColorException extends Exception {}
class WhiteException extends ColorException {}
abstract class Color {
    abstract void method() throws ColorException;
}
class White extends Color {
    void method() throws WhiteException {throw new WhiteException();}
    public static void main (String[] args) {
        White white = new White();
        int a,b,c;
        a = b = c = 0;
        try {
            white.method();
            a++;
        } catch (WhiteException e) {
            b++;
        } finally {
            c++;
        }
        System.out.print(a+" "+b+" "+c);
    }}

class Bonus {
    public static void main(String[] args) {
        System.out.print(new Bonus().methodA());
    }
    int methodA() {
        if (methodB() == -1) {
            try {
                throw new Exception("methodA");
            } catch(Exception e) {
                return 1;
            } finally {
                return 3;
            }
        } else {
            return 5;
        }
    }
     int methodB() {
        if (true) {
            try {
                throw new Exception("methodB");
            } finally {
                return -1;
            }
        } else {
            return 42; } } }



