package designPattern.proxy.payment;

public class CreditCard implements Payment{
    private Payment cash = new Cash();
    private  String password;

    public CreditCard( String password) {
        this.password = password;
    }

    @Override
    public void pay(Long moneyAmount) throws Exception {
    if (password=="123"){
        cash.pay(moneyAmount);
    }else
       throw new Exception("password is not correct");
    }
}
