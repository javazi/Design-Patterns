package designPattern.abstractFactory2;

public class MotorCycleFactory extends AbstractFactory{
    @Override
    Car getCar(Car car) {
        return null;
    }

    @Override
    MotorCycle getMotorCycle(MotorCycle motorCycle) {
        if (motorCycle.equals("Yamaha")){
            return new Yamaha();
        }else if (motorCycle.equals("Suzuki")){
            return new Suzuki();
        } return null;
    }
}
