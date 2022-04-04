package designPattern.abstractfactory;

public class HandBuiltTable implements Table{
    @Override
    public void dine() {
        System.out.println("Hand produced Table");
    }
}
