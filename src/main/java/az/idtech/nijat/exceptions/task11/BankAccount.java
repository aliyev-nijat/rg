package az.idtech.nijat.exceptions.task11;

import java.time.LocalDate;
import java.util.Scanner;

public class BankAccount {

    private double balance;
    private double dailyLimit;
    private LocalDate today;
    private String pin;

    public BankAccount() {
        this.dailyLimit = 100.00;
        this.today = LocalDate.now();
    }

    public double withdrawing(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        if (!scanner.nextLine().equals(pin)) {
            throw new InvalidPinException();
        }
        if (!today.equals(LocalDate.now())) {
            today = LocalDate.now();
            dailyLimit = 100.00;
        }
        if (amount > balance) {
            throw new InsufficientBalanceException();
        }
        if (amount > dailyLimit) {
            throw new DailyLimitException();
        }
        dailyLimit -= amount;
        balance -= amount;

        return balance;
    }
}
