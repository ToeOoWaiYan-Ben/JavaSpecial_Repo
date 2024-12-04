package Day6;

import java.time.LocalDateTime;

public class Hw_1 {
    private String accountHolderName;
    private String accountNumber;
    private double balance;
    private LocalDateTime lastTransactionTime;

    public Hw_1(String accountHolderName, String accountNumber, double balance, LocalDateTime lastTransactionTime) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.lastTransactionTime = lastTransactionTime;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public LocalDateTime getLastTransactionTime() {
        return lastTransactionTime;
    }

    public void setLastTransactionTime(LocalDateTime lastTransactionTime) {
        this.lastTransactionTime = lastTransactionTime;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            lastTransactionTime = LocalDateTime.now();
            System.out.println("Deposited: $" + amount);
            printAccountDetails();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            lastTransactionTime = LocalDateTime.now();
            System.out.println("Withdrew: $" + amount);
            printAccountDetails();
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }

    private void printAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("Last Transaction Time: " + lastTransactionTime);
    }
    public static void main(String[] args) {
        Hw_1 bank = new Hw_1("Yan", "042131752123", 100000, LocalDateTime.now());
        System.out.println("accountHolderName: " + bank.getAccountHolderName());
        System.out.println("accountNumber: " + bank.getAccountNumber());
        System.out.println("balance: " + bank.getBalance());
        System.out.println("lastTransactionTime: " + bank.getLastTransactionTime());
    }
}
