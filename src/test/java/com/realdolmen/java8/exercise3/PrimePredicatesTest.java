package com.realdolmen.java8.exercise3;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
public class PrimePredicatesTest {

    Predicate<Integer> isPrime;
    Predicate<Integer> isNotPrime;

    private final int[] primesTill30 =  {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
    private final int[] nonPrimesTill30 =  {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 25, 26, 27, 28, 30};

    private List<Integer> primes;
    private List<Integer> nonPrimes;
    private List<Integer> numbers = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        isPrime =  n -> PrimePredicates.isPrime(n);
        isNotPrime = PrimePredicates::isNotPrime;
        primes = new ArrayList<>();
        nonPrimes = new ArrayList<>();
        for(int val : primesTill30) {
            primes.add(val);
        }
        for(int val : nonPrimesTill30) {
            nonPrimes.add(val);
        }
        for(int i=1; i<=30; i++) {
            numbers.add(i);
        }
    }

    @Test
    public void testPrimes () {
        assertTrue("Primes filtering", Predicate.filter(isPrime, numbers).containsAll(primes));
    }

    @Test
    public void testNonPrimes () {
        assertTrue("Non primes filtering", Predicate.filter(isNotPrime, numbers).containsAll(nonPrimes));
    }
}
