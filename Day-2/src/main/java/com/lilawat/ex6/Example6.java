package com.lilawat.ex6;

import com.lilawat.ex6.beans.Bike;
import com.lilawat.ex6.beans.Engine;
import com.lilawat.ex6.beans.Vehicle;
import com.lilawat.ex6.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {
    static void main() {
        var context = 
                new AnnotationConfigApplicationContext
                        (ProjectConfig.class);

        System.out.println("\n === Available Beans ===");

        if (context.containsBean("engine")) {
            Engine engine = context.getBean(Engine.class);
            System.out.println("Engine name = " + engine.getName());
        }
        if (context.containsBean("vehicle")) {
            Vehicle vehicle = context.getBean(Vehicle.class);
            System.out.println("Vehicle name = " + vehicle.getName());
            System.out.println("vehicle engine = " + vehicle.getEngine());
        }

        if (context.containsBean("bike")) {
            Bike b = context.getBean(Bike.class);
            System.out.println("Bike Name :" + b.getName());
        }
    }
}
