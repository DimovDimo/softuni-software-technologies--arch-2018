package Part_V_Classes_and_Objects;

public class Circle {
    private Point center;
    private double redius;


    public Circle(Point center, double redius) {
        this.center = center;
        this.redius = redius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRedius() {
        return redius;
    }

    public void setRedius(double redius) {
        this.redius = redius;
    }
}
