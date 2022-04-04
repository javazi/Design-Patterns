package designPattern.builder;

public class ConcretePizzaBuilder implements PizzaBuilder{
    private Pizza pizza;
    private Integer doughSize, cheeseLayer;
    private Sauce sauceType;
    private Boolean salami;
    private Boolean peperoni;
    private Boolean tomato;
    private Boolean vegetable;
    private Boolean chicken;
    private Boolean meat;

    @Override
    public void reset() {
         this.pizza=new Pizza(null,null,null,null,null,null,null,null,null);
         this.setDoughSize(null);
         this.setCheeseLayer(null);
         this.setSauce(null);
         this.setSalami(null);
         this.setPeperoni(null);
         this.setTomato(null);
         this.setVegetable(null);
         this.setChicken(null);
         this.setMeat(null);
    }

    @Override
    public void setDoughSize(Integer doughSize) {
        this.doughSize = doughSize;
    }
    @Override
    public void setSauce(Sauce sauceType) {
        this.sauceType = sauceType;
    }
    @Override
    public void setCheeseLayer(Integer cheeseLayer) {
        this.cheeseLayer=cheeseLayer;
    }
    @Override
    public void setSalami(Boolean salami) {
        this.salami = salami;
    }
    @Override
    public void setPeperoni(Boolean peperoni) {
        this.peperoni = peperoni;
    }
    @Override
    public void setTomato(Boolean tomato) {
        this.tomato = tomato;
    }
    @Override
    public void setVegetable(Boolean vegetable) {
        this.vegetable = vegetable;
    }
    @Override
    public void setChicken(Boolean chicken) {
        this.chicken = chicken;
    }
    @Override
    public void setMeat(Boolean meat) {
        this.meat = meat;
    }
    public Pizza getResult(){
        this.pizza = new Pizza(doughSize,cheeseLayer,sauceType,salami,peperoni,tomato,vegetable,chicken,meat);
        return pizza;
    }

}
