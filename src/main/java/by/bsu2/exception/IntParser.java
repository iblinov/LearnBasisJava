package by.bsu2.exception;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class IntParser {
    public int method(int b, int c) throws ProjectException {
        int a;
        try {
            a = b / c;
        } catch (ArithmeticException e) {
            throw new ProjectException(e);
        }
        return a;
    }
}
