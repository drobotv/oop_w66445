package lab4.shapes;

public class Szescian extends Shape {
    private double a;

    public Szescian(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return 6 * a * a;
    }

    @Override
    public double getVolume() {
        return a * a * a;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Strona = " + a);
    }
}
