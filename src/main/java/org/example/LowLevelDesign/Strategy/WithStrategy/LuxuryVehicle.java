package org.example.LowLevelDesign.Strategy.WithStrategy;

import org.example.LowLevelDesign.Strategy.WithStrategy.strategy.SpecialDriveStrategy;

public class LuxuryVehicle extends Vehicle{
    public LuxuryVehicle() {
        super(new SpecialDriveStrategy());
    }
}
