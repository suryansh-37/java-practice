package bankaccountproject;

public class BankApplication {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV001", "Alice", 1000, 3.0);
        CheckingAccount checking = new CheckingAccount("CHK001", "Bob", 500, 200);

        savings.deposit(200);
        savings.calculateInterest(); // Corrected method name
        checking.withdraw(700); // Example amount exceeding balance but within overdraft
        checking.withdraw(100);

        System.out.println("Savings Balance: $" + savings.getBalance());
        System.out.println("Checking Balance: $" + checking.getBalance());
    }
}