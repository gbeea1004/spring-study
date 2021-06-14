package com.geon.springstudy.service.book;

import com.geon.springstudy.domain.book.Book;
import com.geon.springstudy.domain.book.BookRepository;
import com.geon.springstudy.domain.book.BookStatus;

import java.time.LocalDateTime;

public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public Book save(Book book) {
        book.setCreated(LocalDateTime.now());
        book.setBookStatus(BookStatus.DRAFT);
        return bookRepository.save(book);
    }
}
