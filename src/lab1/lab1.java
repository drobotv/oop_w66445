package lab1;

import java.util.Scanner;
import java.lang.Math;

public class lab1 {
    public static void main(String[] args) {
        //zad1
//        System.out.println(getName());
//        System.out.println(getAge());

        //zad2
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        printResult(a,b);

        //zad3
//        System.out.println(isEven(5));

        //zad4
//        System.out.println(isDividableBy3and5(15));

        //zad5
//        System.out.println(toPowerOf3(1.5));

        //zad6
//        System.out.println(getSqrt(1.5));

        //zad7
//        Scanner input = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        System.out.println(checkTriangle(getRandom(a,b),getRandom(a,b),getRandom(a,b)));
//        System.out.println(checkTriangle(3,4,5));
    }

    public static Boolean checkTriangle(double a, double b, double c) {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c );
        if (a == 0 || b == 0 || c == 0){
            return false;
        }
        return a * a + b * b == c * c ||
                b * b + c * c == a * a ||
                c * c + a * a == b * b;
    }
    public static int getRandom(int a, int b){
        if (a==b){
            return a;
        }
        if (a>b){
            return (int) ((Math.random() * (a - b + 1)) + b);
        } else{
            return (int) ((Math.random() * (b - a + 1)) + a);
        }
    }

    public static double getSqrt(double a) {
        return Math.sqrt(a);
    }

    public static double toPowerOf3(double a) {
        return Math.pow(a,3);
    }

    public static Boolean isDividableBy3and5(int a) {
        if(a%3==0 && a%5==0){
            return true;
        }
        return false;
    }

    public static Boolean isEven(int a) {
        if(a%2==0){
            return true;
        }
        return false;
    }

    public static void printResult(int a, int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
    }

    public static String getName(){
        return "Wladek";
    }
    public static int getAge(){
        return 21;
    }
}