package by;

public class CircleAction extends Action {
    @Override
    public double define(double... b) {
        return Math.pow(b[0], 2) * Math.PI;
    }
}
