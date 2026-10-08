abstract class paymentgateway {
    void printreceipt() {
        System.out.println("receipt generated");
    }

    abstract void processPayment(double amount);
}

class upipayment extends paymentgateway {
    @Override
    void processPayment(double amount) {
        System.out.println("processing " + amount + " via upi");
    }
}

class creditcard extends paymentgateway {
    @Override
    void processPayment(double amount) {
        System.out.println("processing " + amount + " via cards");
    }
}

class abstraction {
    public static void main(String[] args) {
        paymentgateway pg = new upipayment();
        pg.processPayment(5000);
    }
}
