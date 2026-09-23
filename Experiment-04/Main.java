class Account {
    String accountHolderName;
    int accountNumber;

    Account(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    void displayAccountDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String accountHolderName, int accountNumber) {
        super(accountHolderName, accountNumber);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("Yogashri", 1001);
        CurrentAccount currentAccount = new CurrentAccount("Rahul", 1002);
        PremiumSavingsAccount premiumSavingsAccount = new PremiumSavingsAccount("Ananya", 1003);

        System.out.println("Savings Account");
        savingsAccount.displayAccountDetails();

        System.out.println("\nCurrent Account");
        currentAccount.displayAccountDetails();

        System.out.println("\nPremium Savings Account");
        premiumSavingsAccount.displayAccountDetails();
    }
}
