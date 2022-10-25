import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class lab3 {
    public static void main(String[] args) {

//        zad1();
//        zad2();
//        zad3();
        zad4();
//        zad5();
//        zad6();
//        zad7();
//        Definicja();
    }

    public static void Definicja(){
        double [] data;
        data = new double[30];

        double [] data1 = new double[30];
        String test = "Kot";


//        System.out.println(data.length);
//        System.out.println(test.length());
//
//        for (double i : data){
//            System.out.println(i);
//        }

        int [][] tabA = {
                {1,2,3},
                {1,2,3,4,5},
                {1,2}
        };
        int [][][] tabB = {
                {
                        {1,1,1},
                        {1,1,1,1,1},
                        {1,1}
                },
                {
                        {2,2,2},
                        {2,2,2,2,2},
                        {2,2}
                }
        };
//
//        for (int [] i : tabA) {
//            for (int j : i) {
//                System.out.printf(j + " ");
//            }
//            System.out.println();
//        }

//        for (int [][] i : tabB) {
//            for (int [] ii : i) {
//                for (int iii : ii) {
//                    System.out.printf(iii + "");
//                }
//                System.out.println();
//            }
//            System.out.println();
//        }




        int [] tabAa ={3,2,1};
        int [] tabAb ={1,2,3,4,5};
        System.arraycopy(tabAa,0,tabAb, 0, 3);

        for (int i : tabAb) {
                System.out.printf(i + " ");
        }
    }

    public static double[] generujDouble(int ilosc){
        double tab[] = new double[ilosc];
        Random rand = new Random();
        for(int i = 0; i < ilosc; i++){
            tab[i] = rand.nextDouble(26)-10;
        }
        return tab;
    }

    public static int InputInt(){
        Scanner input = new Scanner(System.in);
        System.out.println("Int: ");
        int n = input.nextInt();
        return n;
    }

    public static String InputString(){
        Scanner input = new Scanner(System.in);
        System.out.println("String: ");
        String n = input.nextLine();
        return n;
    }

    public static String ReverseString(String str){
        StringBuilder n = new StringBuilder(str);
        n.reverse();
        return n.toString();
    }

    public static void zad1(){
        double [] array = new double[20];
        double suma = 0, srednia;

        array = generujDouble(20);

        for (double i : array) {
            suma += i;
        }

        srednia = suma / array.length;

        System.out.println("Suma: " + suma);
        System.out.println("Srednia: " + srednia);

    }



    public static void zad2() {
        int len1 = 4;
        int len2 = 3;

        int [] tab1 = new int [len1];

        for (int i = 0; i < len1; i++) {
            System.out.println("Podaj " + (i+1) + " element 1 tablicy: ");
            tab1[i] = InputInt();
        }

        int [] tab2 = new int [len2];

        for (int i = 0; i < len2; i++) {
            System.out.println("Podaj " + (i+1) + " element 2 tablicy: ");
            tab2[i] = InputInt();
        }

        System.out.println("Co drugi el 1 tablicy: ");
        for (int i = 0; i < len1; i++) {
            if ((i+1)%2 == 0){
                System.out.printf(tab1[i] + "\t");
            }
        }

        System.out.println("\nCo drugi el 2 tablicy: ");
        for (int i = 0; i < len2; i++) {
            if ((i+1)%2 == 0){
                System.out.printf(tab2[i] + "\t");
            }
        }



    }

    public static void zad3() {
        String [] tablica = {"Ala","nie","ma","kota"};
        System.out.println();

        for ( String s : tablica) {
            System.out.printf(s.toUpperCase(Locale.ROOT) + " ");
        }
        System.out.println();

    }

    public static void zad4(){
        String [] tablica = new String[5];

        for (int i = 0; i < tablica.length; i++) {
            System.out.println("Podaj " + (i+1) + " slowo: ");
            tablica[i] = InputString();
        }

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = ReverseString(tablica[i]);
        }
        System.out.println();
        for (int i = tablica.length - 1; i >= 0; i--) {
            System.out.printf(tablica[i] + " ");
        }

    }
    public static void zad5() {

    }
    public static void zad6() {}
    public static void zad7() {}

}
