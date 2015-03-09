package com.realdolmen.java8.exercise3;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class PrimePredicates {

    public static boolean isPrime(Integer n) {
        boolean isPrime = true;
        for(int i=2; i<=n/2; i++) {
            Integer remainder = n % i;
            if( remainder == 0 &&  i!= n) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    public static boolean isNotPrime(Integer n) {
        return !isPrime(n);
    }

}
