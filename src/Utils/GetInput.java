package Utils;

import java.util.Scanner;

public class GetInput {

    public static int Int(String message){
        if (message != null) System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static double Double(String message){
        if (message != null) System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static String String(String message){
        if (message != null) System.out.println(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
