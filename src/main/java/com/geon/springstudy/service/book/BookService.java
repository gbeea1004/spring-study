package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;


    public void printBookRepository() {
        System.out.println(bookRepository.getClass());
    }
}
