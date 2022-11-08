package lab4.shapes;

public class Prostokat extends Shape {
    private double a;
    private double b;

    public Prostokat(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Strona a = " + a);
        System.out.println("Strona b = " + b);
    }
}
