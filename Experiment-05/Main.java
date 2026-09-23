class Payment {
    void makePayment(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using Payment");
    }

    void makePayment(double amount, String paymentMethod) {
        System.out.println("Payment of Rs. " + amount + " made using " + paymentMethod);
    }

    void makePayment(String receiver, double amount) {
        System.out.println("Payment of Rs. " + amount + " made to " + receiver);
    }
}

class UPIPayment extends Payment {
    @Override
    void makePayment(double amount) {
        System.out.println("Payment of Rs. " + amount + " made using UPI");
    }
}

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();

        payment.makePayment(1000);
        payment.makePayment(1500, "Credit Card");
        payment.makePayment("ABC Store", 2000);

        UPIPayment upiPayment = new UPIPayment();
        upiPayment.makePayment(2500);
    }
}
