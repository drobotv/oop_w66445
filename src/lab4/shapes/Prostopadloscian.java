package lab4.shapes;

public class Prostopadloscian extends Shape {
    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return 2 * a * b + 2 * a * c + 2 * b * c;
    }

    @Override
    public double getPerimeter() {
        return 4 * a + 4 * b + 4 * c;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Strona a = " + a);
        System.out.println("Strona b = " + b);
        System.out.println("Strona c = " + c);
    }
}
