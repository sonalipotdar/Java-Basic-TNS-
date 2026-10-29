package com.servlet.demo.basic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.CommandLineRunner;

@Configuration
public class BeanConfiguration {

    @Bean
    public BasicBean basicBean() {
        return new BasicBean("Spring bean");
    }

    @Bean
    public CommandLineRunner printBeanGreeting(BasicBean basicBean) {
        return args -> System.out.println(basicBean.greet());
    }
}