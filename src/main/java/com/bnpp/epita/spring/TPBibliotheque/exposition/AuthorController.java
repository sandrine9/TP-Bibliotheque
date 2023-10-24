package com.bnpp.epita.spring.TPBibliotheque.exposition;

import com.bnpp.epita.spring.TPBibliotheque.application.IAuthorService;
import com.bnpp.epita.spring.TPBibliotheque.domaine.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/author")
public class AuthorController {

    @Autowired
    IAuthorService serviceAuthor;

    @PostMapping
    public void create(@RequestBody Author a){
        serviceAuthor.create(a);
    }
    @GetMapping
    public List<Author> findByName(String name){
        return serviceAuthor.findByName(name);
    }
}
