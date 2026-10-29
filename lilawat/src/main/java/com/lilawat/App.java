package com.lilawat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import Bean.Vehicle;
import Config.ProjectConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	  var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
          var veh = context.getBean(Vehicle.class);
          System.out.println("Vehicle name from spring context is : " + veh.getName());
             veh.sayHello();

             context.close();
    }
}
