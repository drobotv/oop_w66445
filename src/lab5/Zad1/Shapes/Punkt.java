package lab5.Zad1.Shapes;

public class Punkt {
    double x, y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
        this(0.0, 0.0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void zeruj() {
        x = 0.0;
        y = 0.0;
    }

    public String opis() {
        return "Punkt{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void przesun(double dx, double dy) {
        x += dx;
        y += dy;
    }
}
