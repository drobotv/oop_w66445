package lab6.zad1.Services;
import lab6.zad1.IServices.*;

public class Samolot implements Lata {
    String nazwa = "Samolot";

    public void lec() {
        System.out.println(nazwa + " leci");
    }
}
