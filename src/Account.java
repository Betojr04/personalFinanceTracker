import java.util.Date;
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

    public void addIncomeTransaction(String description, Date date, String category, double amount){
        Transaction incomeTransaction = new Transaction(description, amount, date, category);

        this.income.addIncome(incomeTransaction);
        this.balance.increaseBalance(amount);
    }

    public void addExpensesTransaction(String description, Date date, String category, double amount) {
        Transaction expensesTransaction = new Transaction(description, amount, date, category);

        this.expenses.addExpense(expensesTransaction);
        this.balance.decreaseBalance(amount);

    }
    // Method to generate report for the account

    // Getters and setters
}
