package com.lilawat.ex5;

import com.lilawat.ex5.beans.Coffee;
import com.lilawat.ex5.beans.CoffeeShop;
import com.lilawat.ex5.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    static void main() {
        var context = new
                AnnotationConfigApplicationContext(ProjectConfig.class);
      var coffeeShop = context.getBean(CoffeeShop.class);
      Coffee coffee = coffeeShop.getCoffee();
        System.out.println(coffee.makeCoffee());
    }
}
