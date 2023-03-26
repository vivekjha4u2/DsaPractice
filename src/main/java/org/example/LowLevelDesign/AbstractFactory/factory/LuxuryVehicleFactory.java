package org.example.LowLevelDesign.AbstractFactory.factory;

import org.example.LowLevelDesign.AbstractFactory.vehicles.Bmw;
import org.example.LowLevelDesign.AbstractFactory.vehicles.Mercedes;
import org.example.LowLevelDesign.AbstractFactory.vehicles.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory {
    @Override
    public Vehicle getVehicle(String model) {
        if(model.equals("Bmw"))
            return new Bmw();
        else if(model.equals("Mercedes"))
            return new Mercedes();
        else
            return null;
    }
}
