package bankaccountproject;

public class CheckingAccount extends BankAccount {
    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit >= amount)) {
            super.withdraw(amount); // Adjusted to handle overdraft correctly
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("No interest for checking accounts.");
    }
}