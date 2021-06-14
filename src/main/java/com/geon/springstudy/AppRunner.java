package com.geon.springstudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    private MessageSource messageSource;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        while (true) {
            System.out.println(messageSource.getMessage("greeting", new String[]{"geonHee"}, Locale.KOREA));
            System.out.println(messageSource.getMessage("greeting", new String[]{"geonHee"}, Locale.US));
            System.out.println(messageSource.getMessage("greeting", new String[]{"geonHee"}, Locale.getDefault())); // 한국어가 기본값이므로 한국어가 적용됨
            Thread.sleep(1000);
        }
    }
}
