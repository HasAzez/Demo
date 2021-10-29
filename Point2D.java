import java.awt.*;

public class Point2D {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public boolean isIdentical(Point2D other) {
        if (this.x == other.x && this.y == other.y)
            return true;
        return false;
    }

    public double getY() {
        return y;
    }
}
