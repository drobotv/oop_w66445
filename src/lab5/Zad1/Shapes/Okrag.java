package lab5.Zad1.Shapes;

import lab5.Zad1.Shapes.Punkt;

public class Okrag extends Figura {
    Punkt srodek;
    double promien;

    public Okrag() {
        srodek = new lab5.Zad1.Shapes.Punkt();
        promien = 0.0;
    }

    public Okrag(lab5.Zad1.Shapes.Punkt srodek, double promien) {
        this.srodek = srodek;
        this.promien = promien;
    }

    public double getPowierzchnia() {
        return (Math.PI * Math.pow(promien, 2));
    }

    public double getSrednica() {
        return (2 * promien);
    }

    public void setPromien(double p) {
        promien = p;
    }

    public double getPromien() {
        return promien;
    }

    public boolean wSrodku(lab5.Zad1.Shapes.Punkt p) {
        double odleglosc = Math.sqrt(Math.pow(p.x - srodek.x, 2) + Math.pow(p.y - srodek.y, 2));
        return odleglosc <= promien;
    }

    @Override
    public String opis() {
        return "Okrag{" +
                "srodek=" + srodek +
                ", promien=" + promien +
                '}';
    }
}
