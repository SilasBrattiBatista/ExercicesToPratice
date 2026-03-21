public class BanckAcoount {
    private int numberAccount;
    private String agencyName;
    private double balance;

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double balance) {
        this.balance += balance;
    }

    public void withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance -= balance;
        } else  {
            System.out.println("Insufficient balance");
        }
    }
}
