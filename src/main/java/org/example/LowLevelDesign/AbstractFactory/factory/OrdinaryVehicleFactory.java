package org.example.LowLevelDesign.AbstractFactory.factory;

import org.example.LowLevelDesign.AbstractFactory.vehicles.Swift;
import org.example.LowLevelDesign.AbstractFactory.vehicles.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory {

    @Override
    public Vehicle getVehicle(String model) {
        if(model.equals("Swift"))
            return new Swift();
        else return null;
    }

}
