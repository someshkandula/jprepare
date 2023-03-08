package multithreading;

import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

public class BigIntegerEx {

    public static void main(String args[]){

        long start = System.currentTimeMillis ();

        SortedSet<BigInteger> primes = new TreeSet<> ();

        while(primes.size () < 20) {
            BigInteger bigInteger = new BigInteger (2000, new Random ());
            primes.add (bigInteger.nextProbablePrime ());

        }
        System.out.println (primes);
        System.out.println ("The time taken was "+(System.currentTimeMillis ()-start) +" ms. ");



    }
}
