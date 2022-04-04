package designPattern.abstractFactory2;

public class CarFactory extends AbstractFactory{
    @Override
    Car getCar(Car car) {
        if (car.equals("Toyota")){
      return new Toyota();
        } else if (car.equals("Renault")){
            return new Renault();
        } else return null;
    };

    @Override
    MotorCycle getMotorCycle(MotorCycle motorCycle) {
        return null;
    }
}
