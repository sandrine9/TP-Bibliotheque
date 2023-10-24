package com.bnpp.epita.spring.TPBibliotheque.infra;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByName(String name);
}
