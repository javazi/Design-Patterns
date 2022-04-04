package designPattern.abstractfactory;

public class HandBuiltChair implements Chair{
    @Override
    public void sit() {
        System.out.println("Hand produced Chair");
    }
}