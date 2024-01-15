public class Category {
    private String name;
    private double budget;

    public Category(String name) {
        this.name = name;
        this.budget = 0.0;
    }

    public void setBudget(double budget){
        this.budget = budget;
    }

    public double getBudget(){
        return this.budget;
    }
    public String getName() {
        return name;
//        GETTER FOR THE CATEGORY NAME
    }

    public void setName(String name) {
        this.name = name;
//        SETTER FOR THE CATEGORY NAME
    }
}


