package com.lilawat.ex4.Beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Car {
    private String carName;
    //    @Autowired
    private Engine engine;

    @Autowired
    public Car(Engine engine)
    {
        this.engine = engine;
        System.out.println("Car Bean Created");
    }

//
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    @PostConstruct
    public void initialize() {
        this.carName = "BMW";
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                '}';
    }
}
