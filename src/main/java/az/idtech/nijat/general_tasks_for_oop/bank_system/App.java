package az.idtech.nijat.general_tasks_for_oop.bank_system;

public class App {

    static void showAccounts(BankAccount[] bankAccounts) {
        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.printf("""
                    %d: %s
                    """,
                    i,
                    bankAccounts[i].toString());
        }
    }

    public static void main(String[] args) {
        BankAccount[] bankAccounts = new BankAccount[3];
        bankAccounts[0] = new SavingsAccount();
        bankAccounts[1] = new CheckingAccount();
        bankAccounts[2] = new CheckingAccount();
        showAccounts(bankAccounts);

        bankAccounts[0].deposit(1200.0);
        bankAccounts[1].deposit(1300.0);
        bankAccounts[2].deposit(1400.0);
        showAccounts(bankAccounts);

        bankAccounts[0].withdraw(700.0);
        bankAccounts[1].withdraw(700.0);
        bankAccounts[2].withdraw(700.0);
        showAccounts(bankAccounts);

        bankAccounts[0].withdraw(200.0);
        showAccounts(bankAccounts);
    }
}
