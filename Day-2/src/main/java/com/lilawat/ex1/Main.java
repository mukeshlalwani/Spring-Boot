package com.lilawat.ex1;

import com.lilawat.ex1.Beans.Vehicle;
import com.lilawat.ex1.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        var veh =   context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh.getName());


        var veh1 = context.getBean("vehicle2", Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh1.getName());


    }
}
