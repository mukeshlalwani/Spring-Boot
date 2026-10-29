package com.lilawat.ex3;

import com.lilawat.ex3.Beans.Vehicle;
import com.lilawat.ex3.Config.AnotherProjectConfig;
import com.lilawat.ex3.Config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example3 {
    static void main() {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class, AnotherProjectConfig.class);
        var veh =   context.getBean(Vehicle.class);
        System.out.println("Vehicle name from spring context is : " + veh.getName());
           veh.sayHello();

           context.close();
    }
}
