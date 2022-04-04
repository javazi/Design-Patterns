package designPattern.builder;

public interface PizzaBuilder {
    void setDoughSize(Integer doughSize);
    void setSauce(Sauce sauce);
    void setCheeseLayer(Integer cheeseLayer);
    void setSalami(Boolean salami);
    void setPeperoni(Boolean peperoni);
    void setTomato(Boolean tomato);
    void setVegetable(Boolean vegetable);
    void setChicken(Boolean chicken);
    void setMeat(Boolean meat);
    void reset();
}
