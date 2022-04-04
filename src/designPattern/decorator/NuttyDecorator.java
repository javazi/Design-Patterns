package designPattern.decorator;

public class NuttyDecorator extends IceCreamDecorator{
    public NuttyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }
    public String addNuts(){
        return " + Nuts";
    }

    @Override
    public String makeIceCream() {
        return super.makeIceCream() + addNuts();
    }
}
