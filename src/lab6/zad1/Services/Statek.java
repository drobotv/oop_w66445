package lab6.zad1.Services;
import lab6.zad1.IServices.*;

public class Statek implements Plywa {
    String nazwa = "Statek";

    public void plyn() {
        System.out.println(nazwa + " plynie");
    }


}
