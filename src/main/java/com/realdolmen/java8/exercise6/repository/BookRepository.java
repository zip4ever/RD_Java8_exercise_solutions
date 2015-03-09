package com.realdolmen.java8.exercise6.repository;

import com.realdolmen.java8.exercise6.domain.Book;

import java.util.List;

/**
 * Created by KDAAU95 on 24/02/2015.
 */
public interface BookRepository {

    List<Book> getBooks();

    // other methods omitted
}
