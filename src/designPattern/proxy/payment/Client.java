package designPattern.proxy.payment;

public class Client {
    public static void main(String[] args) {
        Payment payment = new CreditCard("412");
        try {
            payment.pay(120000L);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Payment p = new CreditCard("123");
        try {
            p.pay(-120000L);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
