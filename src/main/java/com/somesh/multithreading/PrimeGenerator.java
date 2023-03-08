package multithreading;

import java.math.BigInteger;
import java.util.Random;

public class PrimeGenerator implements Runnable {

    @Override
    public void run() {
        BigInteger bigInteger = new BigInteger (2000, new Random ());
        System.out.println (bigInteger);
    }
}
