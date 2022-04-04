package designPattern.abstractFactory2;

public class AbsFctryClient {
    public static void main(String[] args) {
AbstractFactory car =  FactoryProducer.creatVehicle("Car");
        System.out.println(car);
    }
}
