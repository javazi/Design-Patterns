package designPattern.abstractfactory;

public class FactoryBuiltFactory implements AbstractFactory{
    @Override
    public Chair createChair() {
        return new FactoryBuiltChair();
    }

    @Override
    public Table createTable() {
        return new FactoryBuiltTable();
    }
}
