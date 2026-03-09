public class BankAccount {
    private int accountNumber;
    private double balance;
    public String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.owner = owner;
    }

    public BankAccount(int accountNumber, double balance) {}

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
