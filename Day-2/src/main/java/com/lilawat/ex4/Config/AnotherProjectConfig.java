package com.lilawat.ex4.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherProjectConfig {

    @Bean
    String helloWorld() {
        return "Hello World";
    }

    @Bean
    Integer LuckyNumber() {
        return 20;
    }
}
