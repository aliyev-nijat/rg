package az.idtech.nijat.general_tasks_for_oop.bank_system;

public class SavingsAccount extends BankAccount {

    @Override
    public double withdraw(double amount) {
        if (amount > 500.0) {
            System.out.println("LIMIT!!!!");
        } else if (amount > balance) {
            System.out.println("You don't have enough balance");
        } else {
            balance -= amount;
        }

        return balance;
    }

    @Override
    public double deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Amount must be positive");
        }
        else {
            balance += amount;
        }

        return balance;
    }
}
