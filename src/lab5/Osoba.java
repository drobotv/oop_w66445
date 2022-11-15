package lab5;

public class Osoba {
    String imie, nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void Wypisz() {
        System.out.print(imie + " " + nazwisko);
    }
}
