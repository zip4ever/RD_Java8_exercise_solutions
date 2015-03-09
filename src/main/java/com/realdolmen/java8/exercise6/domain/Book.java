package com.realdolmen.java8.exercise6.domain;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public class Book {

    private String title;
    private String author;
    private int yearOfPublication;
    private int numberOfPages;

    public Book(String title, String author, int yearOfPublication, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String toString() {
        return "Author: " + author + "; Title: " + title + "; No. of pages: " + numberOfPages + "; Year: " + yearOfPublication;
    }
}
