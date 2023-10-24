package com.bnpp.epita.spring.TPBibliotheque.application;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Author;
import com.bnpp.epita.spring.TPBibliotheque.infra.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements IAuthorService {
    @Autowired
    IAuthorRepository repoAuthor;

    @Override
    public void create(Author a) {
        repoAuthor.save(a);
    }

    @Override
    public List<Author> findByName(String name) {
        return repoAuthor.findByName(name);
    }
}
