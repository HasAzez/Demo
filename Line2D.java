public class Line2D {
    private Point2D start;
    private Point2D end;
    private final double slope;

    public Line2D(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
        this.slope = (end.getY() - start.getY()) / (end.getX() - start.getX());


    }


    public boolean isParallel(Line2D other) {
        if (this.slope == other.slope)
            return true;
        return false;
    }

    public boolean isPerpendicular(Line2D other) {
        if ((this.slope * other.slope) == -1)
            return true;
        return false;

    }
}
