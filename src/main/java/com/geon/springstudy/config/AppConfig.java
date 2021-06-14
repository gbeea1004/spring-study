package com.geon.springstudy.config;

import com.geon.springstudy.domain.book.BookRepository;
import com.geon.springstudy.service.book.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public BookRepository bookRepository() {
        return new BookRepository();
    }

    @Bean
    public BookService bookService() {
        return new BookService(bookRepository());
    }
}
