package designPattern.abstractfactory;

public class FactoryBuiltTable implements Table{
    @Override
    public void dine() {
        System.out.println("Factory produced Table");
    }
}
