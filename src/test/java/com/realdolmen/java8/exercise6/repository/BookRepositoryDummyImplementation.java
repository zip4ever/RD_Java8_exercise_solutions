package com.realdolmen.java8.exercise6.repository;

import com.realdolmen.java8.exercise6.domain.Book;
import com.realdolmen.java8.exercise6.repository.BookRepository;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public class BookRepositoryDummyImplementation implements BookRepository {

    private final String[] AUTHORS = {"Mario Puzo", "Mario Puzo", "Mario Puzo", "Mario Puzo", "Robert Ludlum", "Jules Vernes", "Victor Hugo", "George Orwell", "Douglas Adams"};
    private final String[] TITLE = {"The Godfather", "Fools Die", "The Sicilian", "The Last Don", "The Bourne Identity", "Twintigduizend mijlen onder zee", "Les Misérables", "1984", "The Hitchhiker's Guide to the Galaxy (A Trilogy in Five Parts"};
    private final int[] PAGES = {498, 369, 385, 403, 598, 400, 792, 326, 1215};
    private final int[] PUB_YEAR = {1969, 1978, 1984, 1996, 1980, 1864, 1862, 1949, 1984};


    @Override
    public List<Book> getBooks() {
        return mockBookList();
    }

    private List<Book> mockBookList() {
        List<Book> books = new ArrayList<>();
        for(int i=0; i<AUTHORS.length; i++) {
            Book book = new Book(TITLE[i], AUTHORS[i], PUB_YEAR[i], PAGES[i]);
            books.add(book);
            // System.out.println("Leap year? " + PUB_YEAR[i] + " - " + isLeapYear(PUB_YEAR[i]));
        }
        return books;
    }

    private boolean isLeapYear(int year) {
        Year y = Year.of(year);
        return y.isLeap();
    }


}
