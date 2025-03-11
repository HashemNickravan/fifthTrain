import payment.*;

public class Main {
    public static void main(String[] args) {

        Customer regularCustomer = new RegularCustomer("Hashem Nickravan");
        Customer premiumCustomer = new PremiumCustomer("Ali Tofighi");

        PaymentStrategy creditCard = new CreditCardPayment("34244545645234324", "Hashem Nickravan");
        PaymentStrategy paypal = new PayPalPayment("hashem.nickravannnnn@gamil.com");

        regularCustomer.displayCustomerInfo();
        premiumCustomer.displayCustomerInfo();

        regularCustomer.makePayment(creditCard, 10000);
        regularCustomer.makePayment(creditCard, 5000);

        premiumCustomer.makePayment(paypal, 320000);
        premiumCustomer.makePayment(paypal, 120000);

        regularCustomer.showPaymentHistory();
        premiumCustomer.showPaymentHistory();
    }
}