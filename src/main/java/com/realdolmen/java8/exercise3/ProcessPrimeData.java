package com.realdolmen.java8.exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class ProcessPrimeData {

    public static void main(String[] args) {
        Predicate<Integer> isPrime = n -> PrimePredicates.isPrime(n);
        Predicate<Integer> isNotPrime = PrimePredicates::isNotPrime;

        List<Integer> numbers = new ArrayList<>();

        for(int i=1; i<=30; i++) {
            numbers.add(i);
        }

        List<Integer> primes = Predicate.filter(isPrime, numbers);
        List<Integer> nonPrimes = Predicate.filter(isNotPrime, numbers);

        System.out.println(Arrays.toString(primes.toArray()));
        System.out.println(Arrays.toString(nonPrimes.toArray()));
    }
}
