package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository geonHeeBookRepository;


    public void printBookRepository() {
        System.out.println(geonHeeBookRepository.getClass());
    }

    @PostConstruct
    public void testPostConstruct() {
        System.out.println("testPostConstruct -> " + geonHeeBookRepository.getClass());
    }
}
