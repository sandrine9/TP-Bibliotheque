package com.bnpp.epita.spring.TPBibliotheque.domaine;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String publicationDate;  // ou tyoe LocalDate
    @ManyToMany(mappedBy = "books") // permet de ne créer qu'une table d'association en liant
    private List<Author> authors;

    /*
    1/ avec cette version, on crée 2 tables d'associations
    @ManyToMany
    private List<Author> authors;

    2/ mappedBy permet de ne créer qu'une seule table d'association
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;

    3/ FETCH permet de lier les tables en lecture. Au chargement de book, ça charge aussi les auteurs
    @ManyToMany(mappedBy = "books", fetch = FetchType.EAGER)
    private List<Author> authors;

     */
    public Book(String title, String publicationDate, List<Author> authors) {
        this.title = title;
        this.publicationDate = publicationDate;
        this.authors = authors;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
}
