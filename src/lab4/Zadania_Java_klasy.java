package lab4;

import java.time.LocalDate;
import Utils.Rand;
import Utils.GetInput;
import lab4.shapes.*;

public class Zadania_Java_klasy {
    public static void main(String[] args) {
        //Zadanie 1
//        DaneOsobe daneOsobe = new DaneOsobe();

        //Zadanie 2
//        Student student1 = new Student("Jan1", "Kowalski");
//        Student student2 = new Student("Jan2", "Kowalski", Rand.getRandomInt(66000, 67000));
//        Student student3 = new Student("Jan3", "Kowalski", Rand.getRandomInt(66000, 67000), "Informatyka");
//        Student student4 = new Student("Jan4", "Kowalski", Rand.getRandomInt(66000, 67000), "Informatyka", 2021);
//
//        student1.pokazDane();
//        student2.pokazDane();
//        student3.pokazDane();
//        student4.pokazDane();

        //Zadanie 3

//        Student customStudent = StudentDane.createStudent();
//        customStudent.pokazDane();

        //Zadanie 4
        Kalkulator.start();

    }

    // Zadanie 1
    public static class Osoba {
        private String imie;
        private String nazwisko;
        private int wiek;

        public Osoba(String imie, String nazwisko, int wiek) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.wiek = wiek;
        }

        public Osoba(String imie, int wiek) {
            this.imie = imie;
            this.wiek = wiek;
            this.nazwisko = "Kowal";
        }

        public Osoba() {
            this.imie = "Jan";
            this.nazwisko = "Kow";
            this.wiek = 25;
        }

        public void pokazDane() {
            System.out.println("Imie: " + imie + " Nazwisko: " + nazwisko + " Wiek: " + wiek);
        }
    }

    public static class DaneOsobe {
        Osoba osoba1 = new Osoba("Jan", "Kowalski", 20);
        Osoba osoba2 = new Osoba("Jan", 30);
        Osoba osoba3 = new Osoba();

        public DaneOsobe() {
            osoba1.pokazDane();
            osoba2.pokazDane();
            osoba3.pokazDane();
        }
    }

    // Zadanie 2

    public static class Student extends Osoba {
        private String imie;
        private String nazwisko;
        private int nr_indeksu;
        private String nazwa_specjalnosci;
        private int rok_studiow;

        public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci, int rok_studiow) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = nr_indeksu;
            this.nazwa_specjalnosci = nazwa_specjalnosci;
            this.rok_studiow = rok_studiow;
        }

        public Student(String imie, String nazwisko, int nr_indeksu, String nazwa_specjalnosci) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = nr_indeksu;
            this.nazwa_specjalnosci = nazwa_specjalnosci;
            this.rok_studiow = LocalDate.now().getYear();
        }

        public Student(String imie, String nazwisko, int nr_indeksu) {
            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = nr_indeksu;
            this.nazwa_specjalnosci = "Informatyka";
            this.rok_studiow = LocalDate.now().getYear();
        }

        public Student(String imie, String nazwisko) {

            this.imie = imie;
            this.nazwisko = nazwisko;
            this.nr_indeksu = Rand.getRandomInt(66000, 67000);
            this.nazwa_specjalnosci = "Informatyka";
            this.rok_studiow = LocalDate.now().getYear();
        }

        public void pokazDane(){
            System.out.println();
            System.out.println("Imie: " + imie);
            System.out.println("Nazwisko: " + nazwisko);
            System.out.println("Nr indeksu: " + nr_indeksu);
            System.out.println("Nazwa specjalnosci: " + nazwa_specjalnosci);
            System.out.println("Rok studiow: " + rok_studiow);
        }
    }

    // Zadanie 3

    //Utwórz klasę (zawierającą metode main), która umożliwia wprowadzanie danych studenta z
    //konsoli. Użyj do tego celu znanego już obiektu Scanner oraz klasy Student z zadania 2.

    public static class StudentDane {

        //(zawierającą metode main)???

        public static Student createStudent() {
            Student student = new Student(
                    GetInput.String("Podaj imie: "),
                    GetInput.String("Podaj nazwisko: "),
                    GetInput.Int("Podaj nr indeksu: "),
                    GetInput.String("Podaj nazwe specjalnosci: "),
                    GetInput.Int("Podaj rok studiow: "));
            return student;
        }
    }

    // Zadanie 4

    public static class Kalkulator {
            public static void start(){
                int choice = GetInput.Int("Wybierz figure: \n" +
                        "1. Kolo\n" +
                        "2. Kwadrat\n" +
                        "3. Prostokat\n" +
                        "4. Szescian\n" +
                        "5. Prostopadloscian\n" +
                        "6. Kula\n" +
                        "7. Stozek\n");
                switch (choice) {
                    case 1 -> {
                        Kolo kolo = new Kolo(GetInput.Double("Podaj promien: "));
                        kolo.printParams();
                    }
                    case 2 -> {
                        Kwadrat kwadrat = new Kwadrat(GetInput.Double("Podaj bok: "));
                        kwadrat.printParams();
                    }
                    case 3 -> {
                        Prostokat prostokat = new Prostokat(GetInput.Double("Podaj bok A: "), GetInput.Double("Podaj bok B: "));
                        prostokat.printParams();
                    }
                    case 4 -> {
                        Szescian szescian = new Szescian(GetInput.Double("Podaj bok: "));
                        szescian.printParams();
                    }
                    case 5 -> {
                        Prostopadloscian prostopadloscian = new Prostopadloscian(GetInput.Double("Podaj bok A: "),
                                GetInput.Double("Podaj bok B: "), GetInput.Double("Podaj bok C: "));
                        prostopadloscian.printParams();
                    }
                    case 6 -> {
                        Kula kula = new Kula(GetInput.Double("Podaj promien: "));
                        kula.printParams();
                    }
                    case 7 -> {
                        Stozek stozek = new Stozek(GetInput.Double("Podaj promien: "), GetInput.Double("Podaj wysokosc: "));
                        stozek.printParams();
                    }
                    default -> System.out.println("Nie ma takiej opcji");
                }
            }

    }

}
