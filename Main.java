public class Main {
    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = PaymentProcessor.getInstance();

        // Default payment method (Credit Card)
        paymentProcessor.processPayment(100.0);

        // Switch to PayPal payment method
        paymentProcessor.setPaymentStrategy(new PayPalPayment("example@example.com"));
        paymentProcessor.processPayment(50.0);

        // Switch to Bitcoin payment method
        paymentProcessor.setPaymentStrategy(new BitcoinPayment("1A2B3C4D5E6F7G8H9I"));
        paymentProcessor.processPayment(200.0);
    }
}
