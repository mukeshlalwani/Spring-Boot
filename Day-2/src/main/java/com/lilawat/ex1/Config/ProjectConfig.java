package com.lilawat.ex1.Config;

import com.lilawat.ex1.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

@Bean
Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return  veh;
    }

    @Bean(("bmw"))
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return  veh;
    }

    @Bean
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return  veh;
    }
}
