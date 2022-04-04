package designPattern.abstractfactory;

public class Demo {
    public static Application configuration() throws NullPointerException{
        Application app;
        AbstractFactory abstractFactory;
        String type = "hand";
        if (type.equalsIgnoreCase("hand")){
            abstractFactory = new HandBuiltFactory();
        app = new Application(abstractFactory);
        return app;
        }
        else if (type.equalsIgnoreCase("factory")){
            abstractFactory= new FactoryBuiltFactory();
            app = new Application(abstractFactory);
            return app;
        }
        return app=null;
    }

    public static void main(String[] args) {
        Application app = configuration();
        app.execute();
    }
}
