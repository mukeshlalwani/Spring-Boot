package com.lilawat.ex4;

import com.lilawat.ex4.Beans.Car;
import com.lilawat.ex4.Beans.Engine;
import com.lilawat.ex4.Beans.Person;
import com.lilawat.ex4.Beans.Vehicle;
import com.lilawat.ex4.Config.AnotherProjectConfig;
import com.lilawat.ex4.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);
        var veh =   context.getBean(Vehicle.class);
        var person = context.getBean(Person.class);

        System.out.println("Person name from spring context is : " + person.getName());
        System.out.println("Vehicle name from spring context is :" + veh.getName());
        System.out.println("Vehicle that person own is : " + person.getVehicle());


        var car = context.getBean(Car.class);
        var engine = context.getBean(Engine.class);
        System.out.println("Car name from spring context is : " + car.getCarName());
        System.out.println("Engine name from spring context is : " + engine.getName());
        System.out.println("Engine that car own is : " + car.getEngine());
    }
}
