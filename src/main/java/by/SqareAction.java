package by;

public class SqareAction extends Action {

    @Override
    public double define(double... b) {
        return b[0]*b[1]/2;
    }
}
