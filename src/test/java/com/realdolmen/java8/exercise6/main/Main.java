package com.realdolmen.java8.exercise6.main;


import com.realdolmen.java8.exercise6.domain.BookCollection;
import com.realdolmen.java8.exercise6.repository.BookRepositoryDummyImplementation;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public class Main {

    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection((new BookRepositoryDummyImplementation()).getBooks());
        System.out.println("The collection has " + bookCollection.getBooks().size() + " books");

        // Select all Books written by “Mario Puzo”
        System.out.println("---------------------------");
        bookCollection.printBooksBy("Mario Puzo");

        // Select all Books published in 2002, by “Mario Puzo” (hint: there are none!)
        System.out.println("---------------------------");
        bookCollection.printBooksBy("Mario Puzo", 2002);

        // Select all Books published between 1960 and 2000
        System.out.println("---------------------------");
        bookCollection.printBooksPublishedBetween(1960, 2000);

        // Select all Books and order them by year of publication
        System.out.println("---------------------------");
        bookCollection.printBooksByPublicationYear();

        // Select all Books written in a leap year
        System.out.println("---------------------------");
        bookCollection.printBooksWrittenInALeapYear();

        // Create an overview of the Books, so that you can easily find them by the first letter of the author’s family name(thus you need something like List<Char, List<Book>>)
        System.out.println("---------------------------");
        bookCollection.printBooksByAuthorName();

    }


}
