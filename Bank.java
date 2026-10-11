class BankAccount{
    String accountholder;
    double balance;

    BankAccount(String accountholder,double balance){
        this.accountholder = accountholder;
        this.balance = balance;
    }


    //deposit
    void deposit(double amount){
        balance += amount;
        System.out.println("withdrawal:"+ amount);
        System.out.println("updated balance:"+balance);
    }

    //withdraw
    void withdraw(double amount){
        if(amount<balance){
            balance-=amount;
            System.out.println("Account holder:"+accountholder);
        }
    }

}
public class Bank{
    public static void main(String[]args){
        BankAccount account = new BankAccount("Alex", 1000.0);
        account.withdraw(100.0);

    }
}