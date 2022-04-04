package designPattern.builder;

public class Demo {
    public static void main(String[] args) {
        ConcretePizzaBuilder pizzaBuilder = new ConcretePizzaBuilder();
        Director director = new Director();
        System.out.println("Hot Peperoni: "+director.makeHotPeperoni(pizzaBuilder));
        System.out.println("Chilli Chicken: "+director.makeChilliChicken(pizzaBuilder));

    }
}
