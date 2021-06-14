package com.geon.springstudy;

import com.geon.springstudy.config.AppConfig;
import com.geon.springstudy.service.book.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

//@SpringBootApplication
public class SpringStudyApplication {

    public static void main(String[] args) {
//        SpringApplication.run(SpringStudyApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        System.out.println("beanDefinitionNames = " + Arrays.toString(beanDefinitionNames));
        BookService bookService = (BookService) context.getBean("bookService");
        System.out.println("bookService = " + bookService != null);
    }

}
