package designPattern.abstractfactory;

public class HandBuiltFactory implements AbstractFactory   {
    @Override
    public Chair createChair() {
        return new HandBuiltChair();
    }

    @Override
    public Table createTable() {
        return new HandBuiltTable();
    }
}
