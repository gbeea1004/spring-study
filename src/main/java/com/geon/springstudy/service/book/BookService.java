package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private final BookRepository geonHeeBookRepository;

    @Autowired
    public BookService(BookRepository geonHeeBookRepository) {
        this.geonHeeBookRepository = geonHeeBookRepository;
    }
}
