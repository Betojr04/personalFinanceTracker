import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello and welcome to Finance Tracker!");

        System.out.println("Do you have an existing account or would you like to create a new one?");
        String accountReply = scanner.nextLine();

        if (accountReply == "new") {
            System.out.println("What would you like to save your account as?");
            String accountName = scanner.nextLine();

            System.out.println("Your new account name is : " + accountName + " .");
        } else if ( accountReply == "existing") {
            System.out.println("What is the name of your existing account?");
            String existingAccount = scanner.nextLine();

            System.out.println("What type of transaction would you like to enter?");
            System.out.println("1 for Income");
            System.out.print("2 for Expense");

            String choice = scanner.nextLine();

            if (choice == "1") {
                System.out.println("Please enter the following for your new income transaction: transaction date," +
                        "transaction amount, transaction description and transaction category");

                String newIcomeTransaction = scanner.next();
            }


        }

        System.out.println("Enter your transaction description: ");
        String description = scanner.nextLine();

        System.out.println("Enter transaction amount: ");
        double amount = scanner.nextDouble();

    }
}
