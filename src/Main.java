import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hello and welcome to Finance Tracker!");
    }
}

class Transaction{
    private String transactionDescription;
    private double transactionAmount;

    public Transaction(String transactionDescription, double transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.transactionDescription = transactionDescription;
    }

}