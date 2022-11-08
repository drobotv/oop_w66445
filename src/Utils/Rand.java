package Utils;

import java.util.concurrent.ThreadLocalRandom;

public class Rand {

    public static int getRandomInt(int min, int max){
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public static double getRandomDouble(double min, double max){
        return ThreadLocalRandom.current().nextDouble(min, max + 1);
    }

}
