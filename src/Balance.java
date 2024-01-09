public class Balance {
    double balance;

    public Balance () {
    this.balance = 0.0;
    }

    public void increaseBalance(double amount){
        balance += amount;
    }

    public void decreaseBalance(double amount){
        balance -= amount;
    }

    public double getBalance(){
        return balance;
    }
}
