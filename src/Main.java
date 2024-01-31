import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        Greeting user at the start of the program
        System.out.println("Hello and welcome to Finance Tracker!");
        /*
        * while loop to keep user in the program to enter more transactions without having to restart the program every
        * time he enters a new one
        * */
        while (true){
            System.out.println("Select an option: \n1. Create a new account \n2. Enter new transaction into existing" +
                    " account \n3. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    createNewAccount(scanner);
                    break;
                case 2:
                    enterTransaction(scanner);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return; //this is exiting the program
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }

        }
    }
}
