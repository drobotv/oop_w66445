package lab5.Zad1.Shapes;

public class Prostokat extends Figura {
    double wys=0, szer=0;

    //Prostokat(float wys,float szer, String kolor)

    public Prostokat(double wys, double szer, String kolor)
    {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    public Prostokat(double wys,double szer){
        this.wys = wys;
        this.szer = szer;

    }

    public double getPowierzchnia() {
        return (szer * wys);
    }

    public void przesun(double x, double y)
    {
        this.wys += y;
        this.szer += x;
    }

    @Override
    public String opis() {
        return "Prostokat{" +
                "wys=" + wys +
                ", szer=" + szer +
                ", kolor='" + kolor + '\'' +
                '}';
    }
}