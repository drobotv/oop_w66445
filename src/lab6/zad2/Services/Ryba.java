package lab6.zad2.Services;
import lab6.zad2.IServices.*;

abstract class Ryba implements Plywanie {
    String nazwa = "Ryba";
    public void plyn() {
        System.out.println(nazwa + " plynie");
    }
    public void wynurz() {
        System.out.println(nazwa + " wynurza sie");
    }
    public void zanurz() {
        System.out.println(nazwa + " zanurza sie");
    }
    public void jedz() {
        System.out.println(nazwa + " je");
    }
    public void wydalaj() {
        System.out.println(nazwa + " wydala");
    }
}
