package lab5.Zad1.Shapes;

import lab5.Zad1.Shapes.Prostokat;

public class Kwadrat extends Prostokat {
    public Kwadrat(double bok, String kolor)
    {
        super(bok, bok, kolor);
    }
    public Kwadrat(double bok)
    {
        super(bok, bok);
    }

    public double getBok()
    {
        return szer;
    }
    public void setBok(double bok)
    {
        this.szer = bok;
        this.wys = bok;
    }

    @Override
    public String opis() {
        return "Kwadrat{" +
                "wys=" + wys +
                ", szer=" + szer +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}
