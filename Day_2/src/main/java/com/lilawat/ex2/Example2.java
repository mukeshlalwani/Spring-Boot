package com.lilawat.ex2;

import com.lilawat.ex2.Beans.Vehicle;
import com.lilawat.ex2.Config.AnotherProjectConfig;
import com.lilawat.ex2.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);
        var veh =   context.getBean("audi", Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh.getName());


        var veh1 = context.getBean("bmw", Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh1.getName());

        var vehcle = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + vehcle.getName());

        var helloWorld = context.getBean(String.class);
        System.out.println("Hello World : " + helloWorld);

        var lucky = context.getBean(Integer.class);
        System.out.println("Lucky Number : " + lucky);
    }
}
