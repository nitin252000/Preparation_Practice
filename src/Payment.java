interface Payment {

    void pay(double amount);
}

abstract class BasePayment implements Payment {

    String companyName;

    BasePayment(String companyName) {
        this.companyName = companyName;
    }

    void logTransaction(double amount) {
        System.out.println(
                "Transaction Logged : " + amount
        );
    }

    abstract void generateReceipt();
}

class UPIPayment extends BasePayment {

    UPIPayment(String companyName) {
        super(companyName);
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "UPI Payment Successful : " + amount
        );

        logTransaction(amount);

        generateReceipt();
    }

    @Override
    void generateReceipt() {

        System.out.println(
                "UPI Receipt Generated"
        );
    }
}

class CreditCardPayment extends BasePayment {

    CreditCardPayment(String companyName) {
        super(companyName);
    }

    @Override
    public void pay(double amount) {

        System.out.println(
                "Credit Card Payment Successful : "
                        + amount
        );

        logTransaction(amount);

        generateReceipt();
    }

    @Override
    void generateReceipt() {

        System.out.println(
                "Credit Card Receipt Generated"
        );
    }
}

 class Mains {

    public static void main(String[] args) {

        Payment upi =
                new UPIPayment("GooglePay");

        upi.pay(5000);

        System.out.println();

        Payment card =
                new CreditCardPayment("Visa");

        card.pay(10000);
    }
}