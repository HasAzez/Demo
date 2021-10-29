import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Point2D pnt1 = new Point2D(1, 2);
        Point2D pnt2 = new Point2D(3, 4);
        Point2D pnt3 = new Point2D(-4, +2);
        Point2D pnt4 = new Point2D(2, -4);
        Line2D line1 = new Line2D(pnt1, pnt2);
        Line2D line2 = new Line2D(pnt3, pnt4);

        if (pnt1.isIdentical(pnt1))
            System.out.println("the two point are identical");
        else
            System.out.println("the two point aren't identical");

        if (pnt2.isIdentical(pnt1))
            System.out.println("the two point are identical");
        else
            System.out.println("the two point aren't identical");

        if (line1.isParallel(line1))
            System.out.println("The two lines are parallel");
        else
            System.out.println("The two lines aren't parallel");


        if (line1.isParallel(line2))
            System.out.println("The two lines are parallel");
        else
            System.out.println("The two lines aren't parallel");


        if (line1.isPerpendicular(line2))
            System.out.println("The two lines are perpendicular to each other");
        else
            System.out.println("The two lines aren't perpendicular to each other");
    }
}
