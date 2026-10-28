package org.example.config;

import org.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig  {

    @Bean
    Vehicle vehicle() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return veh;
    }

    @Bean
    String Hello() {
        return "Hello World";
    }

    @Bean
    Integer LuckyNumber() {
        return 20;
    }
}
