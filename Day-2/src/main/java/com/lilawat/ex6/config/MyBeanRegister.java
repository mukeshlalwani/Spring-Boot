package com.lilawat.ex6.config;

import com.lilawat.ex6.beans.Bike;
import com.lilawat.ex6.beans.Engine;
import com.lilawat.ex6.beans.Vehicle;
import org.springframework.beans.factory.BeanRegistrar;
import org.springframework.beans.factory.BeanRegistry;
import org.springframework.core.env.Environment;

import java.util.Random;

public class MyBeanRegister implements BeanRegistrar {

    @Override
    public void register(BeanRegistry registry, Environment env) {
        int num = new Random().nextInt(100);
        System.out.println("Generated Number : " + num);

        if (num %2  == 0) {
            System.out.println("Even - Registering Engine + Vehicle");
            registry
                    .registerBean("engine",Engine.class,vehicleSpec -> vehicleSpec.supplier(
                    context  -> {
                        Engine engine = new Engine();
                        engine.setName("v8");
                        return engine;
                    }
                    ));
            registry.registerBean("vehicle",Vehicle.class, vehicleSpec -> vehicleSpec.supplier(
                    context  -> {
                        Vehicle vehicle =
                                new Vehicle(context.bean(Engine.class));
                        vehicle.setName("Sports Car");
                        return vehicle;
                    }
            ));
        }else {
            System.out.println("Odd -  Registering bike");
            registry.registerBean(Bike.class);
            registry.registerBean("bike",Bike.class, vehicleSpec -> vehicleSpec.supplier(
                    context  -> {
                        Bike bike = new Bike();
                        bike.setName("Electric Bike");
                        return bike;
                    }
            ));
        }
    }
}
