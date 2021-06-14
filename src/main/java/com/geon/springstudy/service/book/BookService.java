package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.Book;
import com.geon.springstudy.domain.book.BookRepository;
import com.geon.springstudy.domain.book.BookStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BookService {
    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        book.setCreated(LocalDateTime.now());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }
}
