// 3. Implement deposit and withdrawal operations for a bank account.
public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        }
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        System.out.printf("Deposited: %.2f%n", amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance. Withdrawal cancelled.");
        } else {
            balance -= amount;
            System.out.printf("Withdrawn: %.2f%n", amount);
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: %.2f%n", balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", 5000.00);
        account.displayDetails();

        account.deposit(1500.00);
        account.withdraw(2000.00);
        account.withdraw(10000.00); // Demonstrates insufficient-balance handling.

        account.displayDetails();
    }
}
