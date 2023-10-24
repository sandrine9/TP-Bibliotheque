package com.bnpp.epita.spring.TPBibliotheque.application;

import com.bnpp.epita.spring.TPBibliotheque.domaine.Book;
import com.bnpp.epita.spring.TPBibliotheque.infra.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    IBookRepository repoBook;
    @Override
    public void create(Book b) {
        repoBook.save(b);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return repoBook.findByTitle(title);
    }

    @Override
    public Book findById(Long id) {
        Optional<Book> optional=repoBook.findById(id);
        if(!optional.isPresent()){
            throw  new EntityNotFoundException();
        }
        return optional.get();
        //return repoBook.findById(id).get();
    }
}
