public class Balance {
    double currentBalance;

    public Balance () {
    this.balance = 0.0;
    }

    public void increaseBalance(double amount){
        balance += amount;
    }

    public void descreaseBalance(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}
