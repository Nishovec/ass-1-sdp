public class PaymentProcessor {
    private static PaymentProcessor instance;
    private PaymentStrategy paymentStrategy;

    private PaymentProcessor() {
        // Default payment strategy
        paymentStrategy = new CreditCardPayment("0000-0000-0000-0000", "Shaimardanov Erkebulan");
    }

    public static PaymentProcessor getInstance() {
        if (instance == null) {
            instance = new PaymentProcessor();
        }
        return instance;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        paymentStrategy.pay(amount);
    }
}
