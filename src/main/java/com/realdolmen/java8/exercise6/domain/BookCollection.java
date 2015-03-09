package com.realdolmen.java8.exercise6.domain;

import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public class BookCollection {

    private List<Book> books;

    public BookCollection() {
        this.books = new ArrayList<>();
    }

    public BookCollection(List<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printBooksBy(String author) {
        getBooks().stream()
                .filter(b -> b.getAuthor().equals(author))
                .forEach(b -> System.out.println(b.toString()));

    }

    public void printBooksBy(String author, int year) {
        getBooks().stream()
                .filter(b -> b.getAuthor().equals(author))
                .filter(b -> b.getYearOfPublication() == year)
                .forEach(b -> System.out.println(b.toString()));
    }

    public void printBooksPublishedBetween(int startYear, int endYear) {
        getBooks().stream()
                .filter(b -> b.getYearOfPublication() >= startYear)
                .filter(b -> b.getYearOfPublication() <= endYear)
                .forEach(b -> System.out.println(b.toString()));
    }

    public void printBooksByPublicationYear() {
        Comparator<Book> byYearOfPublication = (e1, e2) -> Integer.compare(
                e1.getYearOfPublication(), e2.getYearOfPublication());

        getBooks().stream()
                .sorted(byYearOfPublication)
                .forEach(b -> System.out.println(b.toString()));
    }

    public void printBooksWrittenInALeapYear() {
        getBooks().stream()
                .filter(b -> Year.isLeap(b.getYearOfPublication()))
                .forEach(b -> System.out.println(b.toString()));
    }

    public void printBooksByAuthorName() {
        Map<String, List<String>> books = getBooks().stream()
                .collect(Collectors.groupingBy(Book::getAuthor,
                        Collectors.mapping(Book::getTitle, Collectors.toList())));
        // new Java 8 style of printing a Map ...
        books.forEach((k,v) -> System.out.println(k + " - " + v));
    }
}
