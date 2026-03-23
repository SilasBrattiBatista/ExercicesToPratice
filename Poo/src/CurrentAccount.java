public class CurrentAccount extends BankAccount {

    public CurrentAccount(int accountNumber, double balance, String owner) {
        super(accountNumber, balance, owner);
    }

    public CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }

    public void chargeFee(double fee) {
        double newBalance = getBalance();
        
    }
}
