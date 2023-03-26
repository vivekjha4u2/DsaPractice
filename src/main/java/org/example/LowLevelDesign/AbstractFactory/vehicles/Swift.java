package org.example.LowLevelDesign.AbstractFactory.vehicles;

public class Swift implements OrdinaryVehicle {
    @Override
    public void drive() {
        System.out.println("Driving Swift");
    }

    @Override
    public void capability() {
        System.out.println("Ordinary capability");
    }
}
