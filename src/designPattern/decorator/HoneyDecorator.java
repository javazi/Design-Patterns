package designPattern.decorator;

public class HoneyDecorator extends IceCreamDecorator{
    public HoneyDecorator(IceCream specialIceCream) {
        super(specialIceCream);
    }
    public String addHoney(){
        return " + Honey";
    }
    @Override
    public String makeIceCream(){
        return super.makeIceCream()+ addHoney();
    }
}
