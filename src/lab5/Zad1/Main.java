package lab5.Zad1;
import lab5.Zad1.Shapes.Figura;
import lab5.Zad1.Shapes.Kwadrat;
import lab5.Zad1.Shapes.Prostokat;
import lab5.Zad1.Shapes.Trojkat;

public class Main {
    public static void main(String[] args) {
        // Zadanie 1
//        Punkt p1 = new Punkt();
//        Punkt p2 = new Punkt(3.0, 1.5);
//        Punkt p3 = new Punkt(4.0, -1.5);
//
//        System.out.println("Punkt 1: " + p1.opis());
//        p1.przesun(1.0, 1.0);
//        System.out.println("Punkt 1 przesuniety: " + p1.opis());
//        System.out.println("Punkt 2: " + p2.opis());
//        p2.zeruj();
//        System.out.println("Punkt 2 zerowany: " + p2.opis());
//        System.out.println("Punkt 3: " + p3.opis());

        Figura f1 = new Figura();
        Prostokat p1 = new Prostokat(3.0, 4.0);
        Trojkat t1 = new Trojkat(3.0, 4.0);

        System.out.println("Figura 1: " + f1.opis());
        System.out.println("Prostokat 1: " + p1.getPowierzchnia());
//        15
        p1.przesun(3.0, 5.0);
        System.out.println("Prostokat 1 przesuniety: " + p1.getPowierzchnia());
//        17
        Kwadrat k1 = new Kwadrat(3.0);
        System.out.println("Kwadrat 1: " + k1.getPowierzchnia());
//        19
        System.out.println("Figura 1: " + f1.opis());
        System.out.println("Prostokat 1: " + p1.opis());
        System.out.println("Trojkat 1: " + t1.opis());
        System.out.println("Kwadrat 1: " + k1.opis());


    }
}
