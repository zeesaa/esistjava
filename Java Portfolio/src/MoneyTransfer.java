import java.util.Scanner;

public class MoneyTransfer {
    public static void transfer(Account loggedInAccount, Account[] accounts, Scanner scanner) {
        System.out.print("Enter the ID of the account to transfer to: ");
        long targetAccountId = scanner.nextLong();
        scanner.nextLine();

        Account targetAccount = null;
        for (Account account : accounts) {
            if (account.id == targetAccountId) {
                targetAccount = account;
                break;
            }
        }

        if (targetAccount == null) {
            System.out.println("Account not found. Please check the ID and try again.");
            return;
        }

        System.out.print("Enter the amount to transfer: ");
        double amount;

        try {
            amount = scanner.nextDouble();
            if (amount > 0 && loggedInAccount.balance >= amount) {
                loggedInAccount.balance -= amount;
                targetAccount.balance += amount;
                System.out.println("Transfer successful! Transferred $" + amount + " to " + targetAccount.userName);
                System.out.println("New balance: $" + loggedInAccount.balance);
            } else if (amount <= 0) {
                System.out.println("Invalid transfer amount. It must be greater than 0.");
            } else {
                System.out.println("Insufficient balance. Transfer failed.");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid number.");
            scanner.nextLine();
        }
    }
}
