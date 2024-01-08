import java.util.Date;

//This is the transaction class
public class Transaction {
    private String description;
    private double amount;
    private Date date;
    private String category;

//    This is the transaction constructor within the transaction class
    public Transaction (String description, double amount, Date date, String category){
        this.description = description;
        this.date = date;
        this.amount = amount;
        this.category = category;
    }

    /*
    * BELOW ARE THE GETTERS AND SETTERS FOR THE INITIALIZED DATA FIELDS WE WILL GET
    * */

//    DESCRIPTION GETTER
    public String getDescription() {
        return description;
    }
//    DESCRIPTION SETTER
    public void setDescription (String description){
        this.description = description;
    }
//CATEGORY GETTER
    public String getCategory() {
        return category;
    }
//    CATEGORY SETTER
    public void setCategory (String category){
        this.category = category;
    }
//    AMOUNT SETTER
    public double amount(){
        return amount;
    }
//    AMOUNT GETTER
    public void amount (double amount) {
        this.amount = amount;
    }
//    DATE SETTER
    public Date date () {
        return date;
    }
//    DATE GETTER
    public void date (Date date) {
        this.date = date;
    }
}
