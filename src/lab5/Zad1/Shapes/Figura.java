package lab5.Zad1.Shapes;


import lab5.Zad1.Shapes.Punkt;

public class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    public Figura(){
        punkt = new lab5.Zad1.Shapes.Punkt(0,0);
    }
    public Figura(String kolor){
        this.kolor=kolor;
    }
    public Figura(lab5.Zad1.Shapes.Punkt punkt){
        this.punkt=punkt;
    }
    public String getKolor(){
        return kolor;
    }
    public String opis(){
        return "Figura{" +
                "kolor='" + kolor + '\'' +
                '}';
    }


}