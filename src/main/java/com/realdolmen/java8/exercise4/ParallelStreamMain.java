package com.realdolmen.java8.exercise4;

import java.util.Arrays;

/**
 * Created by KDAAU95 on 23/02/2015.
 */
public class ParallelStreamMain {

    public static void main(String... args) {
        Arrays.asList("a1", "a2", "b1", "c2", "c1", "d1", "d2")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }

}
