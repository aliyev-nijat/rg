package az.idtech.nijat.mitderm1.bank;

public class BankAccount {

    private long accountNumber;
    private double balance;

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid value");
        }
        else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0 ) {
            System.out.println("Invalid Value");
        }
        else if (amount > balance) {
            System.out.println("You don't have balance");
        }
        else {
            balance -= amount;
        }
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
