package by.bsu2.dot.action;

import by.bsu2.dot.entity.Point;
public class ActionPoint {
    public double length(Point point) {
        return Math.hypot(point.getX(), point.getY());
    }
    public boolean checkFirstQuadrant(Point point) {
        boolean result = point.getX() >= 0 && point.getY() >=0;
        return result;
    }
    public boolean checkPointsBelongingToLine(Point pointA, Point pointB) throws IllegalArgumentException{
      boolean res ;
   //   res = pointA.getX() == 0 ? pointB.getX() == 0 : ;

        boolean result = pointA.getY()/pointA.getX() == pointB.getY()/pointB.getX();
        return result;
    }

    public double areaUnderLineThroughCenter(Point point){
        double koef = point.getY()/point.getX();
        double area = 0, currentX=0, currentY, delta = 0.001;
        while(currentX<point.getX()){
            currentX+=delta;
            currentY=currentX*koef;
            area+=Math.abs(delta*currentY);
        }
        return area;
    }

}
