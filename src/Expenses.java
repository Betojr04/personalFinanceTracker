import java.util.ArrayList;
import java.util.List;

public class Expenses {
    private List<Transaction> expenses;

    public Expenses() {
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Transaction transaction) {
        expenses.add(transaction);
    }

    // Additional methods as needed
}
