package lab4.shapes;

public class Kwadrat extends Shape {
    private double a;

    public Kwadrat(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    public void printParams() {
        super.printInfo();

        System.out.println("Strona = " + a);
    }

}
