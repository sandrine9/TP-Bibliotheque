package com.bnpp.epita.spring.TPBibliotheque.infra;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitle(String title);

    // Si on est en LAZYn cette requête chargera les auteurs en allant chercher le livre
    // Si en EAGER, cette requete n'est pas utile, le chargement des auteurs se fera par défaut avec book
    @Query("select b from Book b JOIN FETCH b.authors")
    Book getIDWithAuthors(Long id);
}
