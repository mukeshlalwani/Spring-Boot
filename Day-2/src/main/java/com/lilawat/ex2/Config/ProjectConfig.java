package com.lilawat.ex2.Config;

import com.lilawat.ex2.Beans.Vehicle;
import org.springframework.context.annotation.*;

@Configuration
@Import(AnotherProjectConfig.class)
public class ProjectConfig {

@Bean(name = "audi")
Vehicle vehicle1() {
        var veh = new Vehicle();
        veh.setName("Audi");
        return  veh;
    }

    @Bean(value = "bmw")
    @Primary
    Vehicle vehicle2() {
        var veh = new Vehicle();
        veh.setName("BMW");
        return  veh;
    }

    @Bean({"tesla",
            "myFavCar"})
    @Description("This is a vehicle class")
    Vehicle vehicle3() {
        var veh = new Vehicle();
        veh.setName("Tesla");
        return  veh;
    }
}
