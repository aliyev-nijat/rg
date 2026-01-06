package az.idtech.nijat.general_tasks_for_oop.bank_system;

public abstract class BankAccount {

    protected double balance;

    public abstract double withdraw(double amount);

    public abstract double deposit(double amount);

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
