public class BankAccount {
    private int accountNumber;
    private double balance;
    public String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.owner = owner;
    }

    public BankAccount(int accountNumber, double balance) {}

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void  withdraw(double amount) {
        if  (this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void checkBalance() {
        System.out.println("Balance is " + this.balance);
    }
}
