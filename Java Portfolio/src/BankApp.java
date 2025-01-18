import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = Account.initializeAccounts();
        Account loggedInAccount = Account.login(scanner, accounts);

        if (loggedInAccount != null) {
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("\n1. Deposit (Cash In)");
                System.out.println("2. Money Transfer");
                System.out.println("3. Log Out");
                System.out.print("Choose: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        Deposit.deposit(loggedInAccount, scanner);
                        break;
                    case 2:
                        MoneyTransfer.transfer(loggedInAccount, accounts, scanner);
                        break;
                    case 3:
                        System.out.println("Logging out...");
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        }

        System.out.println("Thank you for using Bank App. Goodbye!");
        scanner.close();
        System.exit(0);
    }
}