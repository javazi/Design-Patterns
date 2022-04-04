package designPattern.abstractfactory;

public class FactoryBuiltChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Factory produced Chair");
    }
}