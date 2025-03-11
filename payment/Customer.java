package payment;

import java.util.ArrayList;

public abstract class Customer {
    protected String name;
    protected ArrayList<String> paymentHistory;

    public Customer(String name) {
        this.name = name;
        this.paymentHistory = new ArrayList<>();
    }

    public abstract void displayCustomerInfo();

    public void makePayment(PaymentStrategy paymentStrategy, double amount) {
        paymentStrategy.pay(amount);
        String paymentInfo = "Amount: " + amount + " rials | Payment way:\n" + paymentStrategy.getPaymentDetails();
        paymentHistory.add(paymentInfo);
    }

    public void showPaymentHistory() {
        System.out.println("History for " + name + ":\n");
        for (String payment : paymentHistory) {
            System.out.println(" " + payment);
        }
    }
}