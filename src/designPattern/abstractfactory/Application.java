package designPattern.abstractfactory;

public class Application {
    Chair chair;
    Table table;
    public Application (AbstractFactory abstractFactory){
        this.chair= abstractFactory.createChair();
        this.table= abstractFactory.createTable();
    }
    public void execute (){
        this.table.dine();
        this.chair.sit();
    }

}
