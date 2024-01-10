
public class Account {
    private String accountName;
    private Balance balance;
    private Expenses expenses;
    private Income income;

    public Account(String accountName){
        this.accountName = accountName;
        this.balance = new Balance();
        this.expenses = new Expenses();
        this.income = new Income();
    }
    // Method to add transaction (income or expense) and update balance
    // Method to generate report for the account

    // Getters and setters
}
