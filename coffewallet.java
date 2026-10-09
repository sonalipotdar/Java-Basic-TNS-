class wallet {
    String name;
    double balance;

    wallet(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void addFund(double amount) {  // add money
        balance += amount;
        System.out.println("added=" + amount);
        System.out.println("totalbalance=" + balance);
    }

    void purchase(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("purchase successful:" + amount);
            System.out.println("remaining balance:" + balance);
        } else {
            System.out.println("insufficient balance");
        }
    }

    void showbalance(){
        System.out.println("name:" + name);
        System.out.println("current balance:"+balance);
    }
}

class coffewallet {
    public static void main(String[] args) {
        wallet wallet = new wallet("sonali", 500);
        wallet.addFund(200);
        wallet.purchase(150);
        wallet.purchase(800);
    }
}