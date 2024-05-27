package by.bsu2.dot.creator;

import by.bsu2.dot.entity.Point;

public class PointCreator {
    public Point create(String... data) {
        Point point = null;
        try {
            int x = Integer.parseInt(data[0]);
            int y = Integer.parseInt(data[1]);
            point = new Point(x, y);
        } catch (NumberFormatException e) {
            System.err.println("Invalid format number: ");
            point = new Point(0, 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Invalid array size: ");
        }
        return point;
    }
}
