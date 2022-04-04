package designPattern.decorator;

public class Client {
    public static void main(String[] args) {
        IceCream yummy = new HoneyDecorator(new NuttyDecorator(new BaseIceCream()));
        System.out.println(yummy.makeIceCream());
        IceCream soYummy = new NuttyDecorator(new HoneyDecorator(new HoneyDecorator
                (new NuttyDecorator(new NuttyDecorator(new BaseIceCream()) ))));
        System.out.println(soYummy.makeIceCream());

        IceCream icecream = new BaseIceCream();
        System.out.println(icecream.makeIceCream());

        IceCream honeyIce = new HoneyDecorator(new BaseIceCream());
        System.out.println(honeyIce.makeIceCream());
    }
}
