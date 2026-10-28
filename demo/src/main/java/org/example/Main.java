package org.example;


import org.example.beans.Vehicle;
import org.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    static void main() {
        Vehicle veh = new Vehicle();
        veh.setName("audi");
        System.out.println("Vehicle name from non-spring context is : " + veh.getName());


        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
      var vehi =   context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + vehi.getName());


        String hello = context.getBean(String.class);
        System.out.println("String value from spring context is : " + hello);

        Integer  num = context.getBean(Integer.class);
        System.out.println("Integer value from spring context : " + num);

//        context.getBean(Double.class);
    }
}