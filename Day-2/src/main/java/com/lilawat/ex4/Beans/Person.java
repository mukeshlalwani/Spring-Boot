package com.lilawat.ex4.Beans;

public class Person {

    public Person() {
        System.out.println("Person bean created");
    }

    private Vehicle vehicle;
    private String name;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
