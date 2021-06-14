package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private List<BookRepository> bookRepositories;


    public void printBookRepository() {
        bookRepositories.forEach(System.out::println);
    }
}
