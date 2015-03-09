package com.realdolmen.java8.exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KDAAU95 on 6/03/2015.
 */
@FunctionalInterface
public interface Predicate<T> {
    public boolean test(T t);
    static <T> List<T> filter(Predicate<T> predicate, List<T> source) {
        List<T> destiny = new ArrayList<>();
        for (T item : source) {
            if(predicate.test(item)){
                destiny.add(item);
            }
        }
        return destiny;
    }
}
