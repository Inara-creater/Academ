package Other.FromLessons.Figures;

import java.awt.*;
public class AbstractFigureApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new Point(6,10), new Point(1,3),new Point(11,3));
        int tArea = triangle.calculateArea();
        System.out.println(tArea);
    }
}

