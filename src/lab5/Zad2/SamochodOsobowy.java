package lab5.Zad2;
import Utils.GetInput;

public class SamochodOsobowy extends Samochod{
    double waga, pojemnoscSilnika;
    int iloscOsob;

    public SamochodOsobowy(){
        this(GetInput.String("Podaj marke samochodu: "),
             GetInput.String("Podaj model samochodu: "),
             GetInput.String("Podaj nadwozie samochodu: "),
             GetInput.String("Podaj kolor samochodu: "),
             GetInput.Int("Podaj rok produkcji samochodu: "),
             GetInput.Int("Podaj przebieg samochodu: "),
             GetInput.Double("Podaj wage samochodu: "),
             GetInput.Double("Podaj pojemnosc silnika samochodu: "),
             GetInput.Int("Podaj ilosc osob w samochodzie: "));
    }

    public SamochodOsobowy(String marka, String model, String nadwozie, String kolor, int rokProdukcji, int przebieg, double waga, double pojemnoscSilnika, int iloscOsob) {
        super(marka, model, nadwozie, kolor, rokProdukcji, przebieg);
        this.waga = (waga < 2) ? 2 : Math.min(waga, 4.5);
        this.pojemnoscSilnika = (pojemnoscSilnika < 0.8) ? 0.8 : Math.min(pojemnoscSilnika, 3.0);
        this.iloscOsob = iloscOsob;
    }
}
