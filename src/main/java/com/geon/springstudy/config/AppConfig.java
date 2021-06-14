package com.geon.springstudy.config;

import com.geon.springstudy.domain.book.BookRepository;
import com.geon.springstudy.domain.book.TestBookRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class AppConfig {

    @Bean
    @Profile("test")
    public BookRepository bookRepository() {
        return new TestBookRepository();
    }
}
