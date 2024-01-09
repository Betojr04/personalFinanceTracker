import java.util.ArrayList;
import java.util.List;

public class Income {
    private List<Transaction> incomes;

    public Income() {
        this.incomes = new ArrayList<>();
    }

    public void addIncome(Transaction transaction) {
        incomes.add(transaction);
    }

    // Additional methods as needed
}
