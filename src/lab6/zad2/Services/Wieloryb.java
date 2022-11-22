package lab6.zad2.Services;
import lab6.zad2.IServices.Latanie;

public class Wieloryb extends Ryba implements Latanie {
    public Wieloryb() {
        nazwa = "Wieloryb";
    }

    public void lec() {
        System.out.println(nazwa + " leci");
    }

    public void wyladuj() {
        System.out.println(nazwa + " wyladuje");
    }
}


