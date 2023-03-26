package org.example.LowLevelDesign.AbstractFactory.vehicles;

public class Bmw implements LuxuryVehicle {
    @Override
    public void drive() {
        System.out.println("Driving Bmw");
    }

    @Override
    public void capability() {
        System.out.println("Luxury capability");
    }
}
