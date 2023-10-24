package com.bnpp.epita.spring.TPBibliotheque.application;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Author;
import com.bnpp.epita.spring.TPBibliotheque.domaine.Book;

import java.util.List;

public interface IAuthorService {
    void create(Author a);

    List<Author> findByName(String name);
}
