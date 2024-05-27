package by.bsu2.log4j2.base;

public class Generation {

    public int generateInt() {
        return (int)(Math.random()*10);
    }
    public double generateDouble() {
        return Math.random()*10;
    }

    @Override
    public String toString() {
        return "Generation Class";
    }
}
