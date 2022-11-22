package lab6.zad2.Services;
import lab6.zad2.IServices.*;

abstract class Zwierze implements Plywanie, Latanie {
    String nazwa = "Zwierze";
    public void plyn() {
        System.out.println(nazwa + " plynie");
    }
    public void wynurz() {
        System.out.println(nazwa + " wynurza sie");
    }
    public void zanurz() {
        System.out.println(nazwa + " zanurza sie");
    }
    public void lec() {
        System.out.println(nazwa + " leci");
    }
    public void wyladuj() {
        System.out.println(nazwa + " wyladuje");
    }
}