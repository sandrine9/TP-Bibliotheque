package com.bnpp.epita.spring.TPBibliotheque.exposition;

import com.bnpp.epita.spring.TPBibliotheque.application.IBookService;
import com.bnpp.epita.spring.TPBibliotheque.domaine.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/book")
public class BookController {

    @Autowired
    IBookService serviceBook;

    @PostMapping
    public void create(@RequestBody Book b){
        serviceBook.create(b);
    }

    @GetMapping
    public List<Book> findByTitle(String title){
        return serviceBook.findByTitle(title);
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") Long id){
        return serviceBook.findById(id);
    }

}
