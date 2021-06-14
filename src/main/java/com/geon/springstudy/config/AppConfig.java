package com.geon.springstudy.config;

import com.geon.springstudy.SpringStudyApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SpringStudyApplication.class)
public class AppConfig {
}
