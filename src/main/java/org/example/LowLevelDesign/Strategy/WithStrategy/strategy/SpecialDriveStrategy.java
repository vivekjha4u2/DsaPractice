package org.example.LowLevelDesign.Strategy.WithStrategy.strategy;

import org.example.LowLevelDesign.Strategy.WithStrategy.strategy.DriveStrategy;

public class SpecialDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Special drive capability");
    }
}
