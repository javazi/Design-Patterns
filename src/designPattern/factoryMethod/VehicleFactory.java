package designPattern.factoryMethod;

public class VehicleFactory {
    public Vehicle createVehicle(String vehicleType){
        if (vehicleType== null){
            return null;
        } else if(vehicleType.equals("car")){
            return new Car();
        } else if(vehicleType.equals("motorCycle")){
            return new MotorCycle();
        }
        return null;
    }
}
