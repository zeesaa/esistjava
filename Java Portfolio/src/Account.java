import java.util.Scanner;

public class Account {
    String userName;
    long id;
    int pin;
    double balance;

    Account(long id, int pin, String userName, double balance) {
        this.id = id;
        this.pin = pin;
        this.userName = userName;
        this.balance = balance;
    }

    public static Account[] initializeAccounts() {
        Account account1 = new Account(412435, 7452, "Chris Sandoval", 32000.0);
        Account account2 = new Account(264863, 1349, "Marc Yim", 1000.0);
        return new Account[]{account1, account2};
    }

    public static Account login(Scanner scanner, Account[] accounts) {
        while (true) {
            System.out.println("LOG IN");
            System.out.print("Username: ");
            String username = scanner.nextLine();
            System.out.print("Password: ");
            int pin = scanner.nextInt();
            scanner.nextLine();

            for (Account account : accounts) {
                if (username.equals(account.userName) && pin == account.pin) {
                    System.out.println("\nWelcome, " + account.userName);
                    System.out.println("Account balance: $" + account.balance);
                    return account;
                }
            }
            System.out.println("Invalid username or password.");
            System.out.print("Do you want to try again? (yes/no): ");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                return null;
            }
        }
    }
}