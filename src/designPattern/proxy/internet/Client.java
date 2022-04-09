package designPattern.proxy.internet;

public class Client {
    public static void main(String[] args)  {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("aBc.com");
        }catch (Exception exception){
            System.out.println(exception.getMessage());
        }
    }
}
