package designPattern.abstractFactory2;

public class FactoryProducer {
    public static AbstractFactory creatVehicle(String vehicle){
        if (vehicle.equals("Car")){
            return new CarFactory();
        }else if (vehicle.equals("MotorCycle")){
            return new MotorCycleFactory();
        } else return null;
    }
}
