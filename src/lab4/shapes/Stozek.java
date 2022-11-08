package lab4.shapes;

public class Stozek extends Shape {
    private double r;
    private double h;

    public Stozek(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getArea() {
        return Math.PI * r * (r + Math.sqrt(r * r + h * h));
    }

    @Override
    public double getVolume() {
        return (1/3) * Math.PI * r * r * h;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Promien = " + r);
        System.out.println("Wysokosc = " + h);
    }
}
