package lab5;

public class Student extends Osoba {
    int nrAlbumu;

    public Student(String imie, String nazwisko, int nrAlbumu) {
        super(imie, nazwisko);
        this.nrAlbumu = nrAlbumu;
    }

    public void Wypisz() {
        super.Wypisz();
        System.out.println(" numer: " + nrAlbumu);
    }
}