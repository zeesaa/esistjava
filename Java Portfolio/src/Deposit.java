import java.util.Scanner;

public class Deposit {
    public static void deposit(Account account, Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        double amount;

        try {
            amount = scanner.nextDouble();
            if (amount > 0) {
                account.balance += amount;
                System.out.println("Deposit successful! \nNew balance: $" + account.balance);
            } else {
                System.out.println("Invalid amount.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine();
        }
    }
}