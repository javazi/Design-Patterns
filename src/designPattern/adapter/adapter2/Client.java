package designPattern.adapter.adapter2;

public class Client {
    public static void main(String[] args) {

        Movable car = new Car1();
        MovableAdapter carAdapter = new MovableAdapterImpl(car);
        System.out.println(carAdapter.getSpeed());
    }
}
