package designPattern.abstractfactory;
//this project creates a couple of chair and table at the same time with their type either hand built or factory built.
public interface AbstractFactory {
    Chair createChair();
    Table createTable();
}

