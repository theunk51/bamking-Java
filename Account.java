public class Account {

    private double balance;
    //you only want the  the balance to be modified by one class

    // set the balance to 0.00
    public Account() {
        balance = 0.00;
    }
    
    // deposit
    public void deposit(double amount) {
        balance =  balance + amount;
    }

    // widthdrawl
    public void withdrawal(double amount) {
        balance = balance - amount;
    }

    // get balance
    public double getBalance() {
        return balance;
    }
}