package com.bnpp.epita.spring.TPBibliotheque.application;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Book;

import java.util.List;

public interface IBookService {

    void create(Book b);

    List<Book> findByTitle(String title);
    Book findById(Long id);
}
