package org.example.LowLevelDesign.Strategy.WithoutStrategy;

public class OffroadVehicle extends Vehicle{
    @Override
    void drive() {
        System.out.println("Special drive capability");
    }
}
