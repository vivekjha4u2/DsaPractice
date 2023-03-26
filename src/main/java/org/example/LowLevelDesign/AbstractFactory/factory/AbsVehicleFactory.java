package org.example.LowLevelDesign.AbstractFactory.factory;

//factory of factories
public class AbsVehicleFactory {
    // it will give the obj of LuxVehicleFactory and OrdinaryVehicleFactory
    public VehicleFactory getVehicleFactory(String vf){
        if(vf.equals("Ordinary"))
            return new OrdinaryVehicleFactory();
        else if(vf.equals("Luxury"))
            return new LuxuryVehicleFactory();
        else return null;
    }
}
