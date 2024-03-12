import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //        Greeting user at the start of the program
        System.out.println("Hello and welcome to Finance Tracker!");

        System.out.println("1.) Create a new account 2.) Enter New Transaction into an existing account");
        int initialAnswer = scanner.nextInt();

        switch (initialAnswer) {
            case 1 :
                System.out.println("Please enter the name of your new account");
                String newAccountName = scanner.nextLine();

                break;

            case 2 :
                System.out.println("Which existing account would you like to add a transaction to?");
                String existingAccountName = scanner.nextLine();
        }


    }
}
