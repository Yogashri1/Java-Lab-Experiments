import java.util.InputMismatchException;
import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance for withdrawal");
        }

        balance = balance - amount;
        System.out.println("Withdrawal successful");
        System.out.println("Updated Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Initial Account Balance: ");
            double balance = scanner.nextDouble();

            BankAccount account = new BankAccount(balance);

            System.out.print("Enter Withdrawal Amount: ");
            double amount = scanner.nextDouble();

            account.withdraw(amount);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed.");
            scanner.close();
        }
    }
}
