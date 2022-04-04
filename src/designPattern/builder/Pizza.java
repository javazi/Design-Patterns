package designPattern.builder;

public class Pizza {
    private final Integer doughSize, cheeseLayer;
    private final Sauce sauceType;
    private final Boolean salami;
    private final Boolean peperoni;
    private final Boolean tomato;
    private final Boolean vegetable;
    private final Boolean chicken;
    private final Boolean meat;

    public Pizza(Integer doughSize, Integer cheeseLayer,
                 Sauce sauceType, Boolean salami, Boolean peperoni,
                 Boolean tomato, Boolean vegetable, Boolean chicken, Boolean meat) {
        this.doughSize = doughSize;
        this.cheeseLayer = cheeseLayer;
        this.sauceType = sauceType;
        this.salami = salami;
        this.peperoni = peperoni;
        this.tomato = tomato;
        this.vegetable = vegetable;
        this.chicken = chicken;
        this.meat = meat;
    }

    @Override
    public String toString() {
        String salam,pep,tom,veg,chick,mea;
        if (salami!=null)
            salam = "Salami";
        else
            salam = "";
        if (peperoni!=null)
            pep = "Peperoni";
        else
            pep = "";
        if (tomato!=null)
            tom = "Tomato";
        else
            tom = "";
        if (vegetable!=null)
            veg = "Vegetable";
        else
            veg = "";
        if (chicken!=null)
            chick = "Chicken";
        else
            chick = "";
        if (meat!=null)
            mea = "Meat";
        else
            mea = "";

        return "{" +
                "doughSize=" + doughSize +
                ", cheeseLayer=" + cheeseLayer +
                ", sauceType=" + sauceType +
                ", salami=" + salami +
                ", peperoni=" + peperoni +
                ", tomato=" + tomato +
                ", vegetable=" + vegetable +
                ", chicken=" + chicken +
                ", meat=" + meat +
                '}';
    }
}
