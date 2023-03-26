package org.example.LowLevelDesign.AbstractFactory.vehicles;

public class Mercedes implements LuxuryVehicle {
    @Override
    public void drive() {
        System.out.println("Driving Mercedes");
    }

    @Override
    public void capability() {
        System.out.println("Luxury capability");
    }
}
