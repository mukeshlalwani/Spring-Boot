package com.lilawat.ex4.Config;

import com.lilawat.ex4.Beans.Person;
import com.lilawat.ex4.Beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ={"com.lilawat.ex4"} )
public class ProjectConfig {

    @Bean
    Vehicle vehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Toyota");
        return vehicle;
    }

//    @Bean
//    Person person() {
//        Person person = new Person();
//        person.setName("John");
//        person.setVehicle(vehicle());
//        return person;
//    }

    @Bean
    Person person(Vehicle vehicle) {
        Person person = new Person();
        person.setName("John");
        person.setVehicle(vehicle);
        return person;
    }
}
