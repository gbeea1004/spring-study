package com.geon.springstudy;

import com.geon.springstudy.domain.book.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    private ApplicationContext ac;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment = ac.getEnvironment();
        System.out.println("environment = " + Arrays.toString(environment.getActiveProfiles()));
        System.out.println("environment = " + Arrays.toString(environment.getDefaultProfiles()));

    }
}
