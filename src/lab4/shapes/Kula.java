package lab4.shapes;

public class Kula extends Shape {
    private double r;

    public Kula(double r) {
        this.r = r;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * r * r;
    }

    @Override
    public double getVolume() {
        return (4/3) * Math.PI * r * r * r;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Promien = " + r);
    }
}
