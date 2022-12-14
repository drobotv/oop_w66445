package lab7;

import java.util.ArrayList;
import java.util.LinkedList;

public class zadania09 {
    public static void main(String[] args) {

        ArrayList<Uczestnik> uczestnicy = new ArrayList<>();

        uczestnicy.add(new Uczestnik("Janek", 20));
        uczestnicy.add(new Uczestnik("Marek", 17));
        uczestnicy.add(new Uczestnik("Zosia", 22));
        uczestnicy.add(new Uczestnik("Janek", 20));
        uczestnicy.add(new Uczestnik("Bartek", 17));

        ArrayList<Uczestnik> filtered = filterUnderage(uczestnicy);

        for (Uczestnik u : filtered) {
            System.out.println(u.toString());
        }

        LinkedList<Uczestnik> uczestnicyLinked = new LinkedList<>();

        uczestnicyLinked.add(new Uczestnik("Janek", 20));
        uczestnicyLinked.add(new Uczestnik("Marek", 17));
        uczestnicyLinked.add(new Uczestnik("Zosia", 22));
        uczestnicyLinked.add(new Uczestnik("Janek", 20));
        uczestnicyLinked.add(new Uczestnik("Bartek", 17));

        LinkedList<Uczestnik> filteredLinked = filterUnderage(uczestnicyLinked);

        for (Uczestnik u : filteredLinked) {
            System.out.println(u.toString());
        }
    }

    public static ArrayList<Uczestnik> filterUnderage(ArrayList<Uczestnik> uczestnicy){
        ArrayList<Uczestnik> filtered = new ArrayList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() >= 18){
                filtered.add(uczestnik);
            }
        }
        return filtered;
    }

    public static LinkedList<Uczestnik> filterUnderage(LinkedList<Uczestnik> uczestnicy){
        LinkedList<Uczestnik> filtered = new LinkedList<>();
        for (Uczestnik uczestnik : uczestnicy) {
            if (uczestnik.getWiek() >= 18){
                filtered.add(uczestnik);
            }
        }
        return filtered;
    }

    public static class Uczestnik {
        private String imie;
        private int wiek;

        public Uczestnik(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
        }

        public String getImie() {
            return imie;
        }

        public int getWiek() {
            return wiek;
        }

        public String toString() {
            return "Uczestnik{" +
                    ", imie='" + imie + '\'' +
                    ", wiek=" + wiek +
                    '}';
        }

        public boolean equals(Uczestnik uczestnik) {
            if (this == uczestnik) return true;
            if (uczestnik == null || getClass() != uczestnik.getClass()) return false;

            Uczestnik uczestnik1 = (Uczestnik) uczestnik;

            if (wiek != uczestnik1.wiek) return false;
            return imie != null ? imie.equals(uczestnik1.imie) : uczestnik1.imie == null;
        }

        public int hashCode() {
            int result = 31 + (imie != null ? imie.hashCode() : 0);
            result = 31 * result + wiek;
            return result;
        }
    }
}
//
//    Napisz klas?? przechowuj??c?? informacje o uczestnikach wydarzenia (ID, imi?? oraz jego wiek).
//        Zaimplementowa?? metod?? toString(), aby wy??wietla?? informacj?? o uczestniku oraz metody equals()
//        oraz hashCode() (metody do por??wnywania obiekt??w). Do przechowywania uczestnik??w nale??y u??y??
//        listy. Ponadto zaproponowa?? metod?? pozwalaj??c?? na filtrowanie os??b niepe??noletnich. Zaproponowa??
//        rozwi??zanie z u??yciem LinkedList oraz ArrayList.

