package com.lilawat.ex3.Beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Vehicle implements InitializingBean {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Printing hello from component vehicle bean ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        this.name = "Audi";
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Destroying vehicle bean");
    }


//    @PostConstruct
//    public void initialize() {
////        System.out.println("Initializing vehicle Bean");
//        this.name = "Audi";
//    }
}
