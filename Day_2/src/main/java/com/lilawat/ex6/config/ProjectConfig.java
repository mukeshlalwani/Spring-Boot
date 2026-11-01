package com.lilawat.ex6.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyBeanRegister.class})
public class ProjectConfig {
}
