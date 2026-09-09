interface PaymentSystem {
    void pay(double amount);
}

class CardPayment implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " руб. с помощью банковской карты.");
    }
}

class SbpPayment implements PaymentSystem {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " руб. по QR-коду через СБП.");
    }
}


public class Polymorphism {
    public static void main(String[] args) {
        PaymentSystem myPayment;
        myPayment = new CardPayment();
        myPayment.pay(1500.0);
        myPayment = new SbpPayment();
        myPayment.pay(500.0);
    }
}