package lab4.shapes;

public class Kolo extends Shape {
    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * r * r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Promien = " + r);
    }
}
