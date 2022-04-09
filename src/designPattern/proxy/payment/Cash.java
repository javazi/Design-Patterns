package designPattern.proxy.payment;

//This class is our Real payment.
public class Cash implements Payment {
    @Override
    public void pay(Long moneyAmount) throws Exception{
        if (moneyAmount > 0) {
            System.out.println("You deposited " + moneyAmount);
        }
        System.out.println("It was withdrawn " + moneyAmount*(-1) + " from your account.");
    }
}
