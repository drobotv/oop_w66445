package lab7;

import Utils.GetInput;

import java.util.*;

class BlednaWartoscSilni extends Exception{
    public BlednaWartoscSilni(String message) {
        super(message);
    }
}

class NieprawidlowyAdres extends Exception{
    public NieprawidlowyAdres(String message) {
        super(message);
    }
}

public class zadania08 {
    public static void main(String[] args) {
//        try {
//            int n = GetInput.Int("Podaj n");
//            System.out.println("Silnia z " + n + " wynosi " + silnia(n));
//        } catch (BlednaWartoscSilni e) {
//            System.out.println(e.getMessage());
//        } catch (InputMismatchException e) {
//            System.out.println("Podano nieprawidłową wartość");
//        }

//        List<Object> list = new ArrayList<>();
//        List<Integer> list2 = new ArrayList<>();
//        list.add(1);
//        list.add("2");
//        list.add(3.0);
//        System.out.println(list.get(1));
//        list.add(1, "4");
//        System.out.println(list.get(1));
//        list.set(1, "5");
//        System.out.println(list.get(1));
//        System.out.println("-----------------");
//        Iterator i = list.iterator();
//        while (i.hasNext()){
//            System.out.println(i.next());
//        }
//
//        System.out.println("-----------------");
//
//        for (Object o : list) {
//            System.out.println();
//        }
//
        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);

        for (Integer i : set) {
            System.out.println(i);
        }


    }

    public static int silnia(int n) throws BlednaWartoscSilni{
        if (n < 0) throw new BlednaWartoscSilni("Silnia nie istnieje dla liczb ujemnych");
        if (n == 0) return 1;
        int wynik = 1;
        for (int i = 1; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }


    class Adres {
    }
}
