package lab4.shapes;

public class Shape {
    public double getArea() {
        return 0;
    }

    public double getPerimeter() {
        return 0;
    }

    public double getVolume() {
        return 0;
    }

    public void printInfo() {
        if (getVolume() == 0) {
            System.out.println("Figura jest plaska");
        } else {
            System.out.println("Figura jest przestrzenna");
        }

        System.out.println("Nazwa: " + this.getClass().getSimpleName());

        System.out.println("Pole: " + getArea());
        System.out.println("Obwod: " + getPerimeter());

        if (getVolume() != 0) {
            System.out.println("Objetosc: " + getVolume());
        }
    }
}
