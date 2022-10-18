import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class lab2 {
    public static void main(String[] args) {

//        Zad1();
//        Zad2();

//        int tab[] = {1,4,6,2,4};
//        Zad3(tab);

//        Zad4(15);

//        Zad5
//        String a = "ala", b = "aleksander", c = "KAJAK", d = "12321";
//        System.out.println("OdpA: " + czyPolindrom(a));
//        System.out.println("OdpB: " + czyPolindrom(b));
//        System.out.println("OdpC: " + czyPolindrom(c));
//        System.out.println("OdpD: " + czyPolindrom(d));

        lab02_Zad1();

    }

    public static double Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("in: ");
        double n = input.nextInt();
        return n;
    }

    public static void Zad1(){
        System.out.println("Podaj n: ");
        double ilStud = Input();
        double a = 0, b = 40, pkt, ile = 0, suma = 0;

        if (ilStud > 0){
            while (ilStud > 0){
                System.out.println("Podaj liczbe punktow: ");
                pkt = Input();
                if (pkt >= a && pkt <=b){
                    suma += pkt;
                    ile++;
                    ilStud--;
                }
            }
            System.out.println("Suma: " + suma);
            System.out.println("Srednia: " + suma/ile);
        } else System.out.println("Ilosc <=0");

    }

    public static void Zad2() {
        int ile = 10;
        int dodatnie = 0, ujemne = 0;
        double input, sumaD = 0, sumaU = 0;

        for (int i = 0; i < ile; i++){
            System.out.println("Podaj liczbe(zostalo "+(ile - i)+"): ");
            input = Input();

            if (input < 0){
                sumaU += input;
                ujemne++;
            } else {
                sumaD += input;
                dodatnie++;
            }
        }
        System.out.println("Suma liczb dodatnich: " + sumaD);
        System.out.println("Ilosc dodatnich: " + dodatnie);
        System.out.println("Suma liczb ujemnych: " + sumaU);
        System.out.println("Suma ujemnych: " + ujemne);
    }

    public static void Zad3(int [] tab) {
        double suma = 0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i]%2==0){
                suma+=tab[i];
            }
        }
        System.out.println("Suma dodatnich: " + suma);
    }

    public static int[] generuj(int ilosc){
        int tab[] = new int[ilosc];
        Random rand = new Random();
        for(int i = 0; i < ilosc; i++){
            tab[i] = rand.nextInt(56)-10;
        }
        return tab;
    }

    public static void Zad4(int ilosc) {
        Zad3(generuj(ilosc));
    }

    public static boolean czyPolindrom(String text) {
        int end = text.length() - 1;
        int middle = text.length() / 2;

        text = text.toLowerCase(Locale.ROOT);

        for(int i = 0; i < middle; i++){
            if (text.charAt(i) != text.charAt(end)) return false;
            end--;
        }
        return true;
    }

    public static void lab02_Zad1() {
        System.out.println("Podaj a,b,c: ");
        double a = Input(), b = Input(), c = Input();
        double delta;

        if(a == 0){
            System.out.println("Odp: " + (-c/b));
        }else{
            delta = Math.pow(b,2) - 4 * a * c;
            if (delta < 0){
                System.out.println("Brak rozwiazan");
            }if(delta == 0){
                System.out.println("x: " + (-b/(a*2)));
            }if(delta > 0){
                System.out.println("x1: " + (-b+Math.sqrt(delta))/(a*2));
                System.out.println("x2: " + (-b-Math.sqrt(delta))/(a*2));
            }
        }
    }

    public static void lab02_Zad2() {

    }

    public static void lab02_Zad3() {

    }

    public static void lab02_Zad4() {

    }

    public static void lab02_Zad5() {

    }

    public static void lab02_Zad6() {

    }

}

