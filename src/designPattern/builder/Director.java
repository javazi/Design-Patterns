package designPattern.builder;

public class Director {

    public Pizza makeHotPeperoni (ConcretePizzaBuilder pizzaBuilder){
        pizzaBuilder.reset();
        pizzaBuilder.setDoughSize(3);
        pizzaBuilder.setSauce(Sauce.HOT);
        pizzaBuilder.setCheeseLayer(5);
//        pizzaBuilder.setSalami(false);
        pizzaBuilder.setPeperoni(true);
        pizzaBuilder.setTomato(true);
//        pizzaBuilder.setVegetable(false);
//        pizzaBuilder.setChicken(false);
//        pizzaBuilder.setMeat(false);
        return pizzaBuilder.getResult();
    } public Pizza makeChilliChicken (ConcretePizzaBuilder pizzaBuilder){
        pizzaBuilder.reset();
        pizzaBuilder.setDoughSize(2);
        pizzaBuilder.setSauce(Sauce.CHILLI);
        pizzaBuilder.setCheeseLayer(4);
//        pizzaBuilder.setSalami(false);
//        pizzaBuilder.setPeperoni(false);
        pizzaBuilder.setTomato(true);
//        pizzaBuilder.setVegetable(false);
        pizzaBuilder.setChicken(true);
//        pizzaBuilder.setMeat(false);
        return pizzaBuilder.getResult();
    }
}
