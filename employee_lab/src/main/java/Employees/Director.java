package Employees;

public class Director extends Manager  {

    protected int budget;

    public Director(String name, String nino, double salary,int budget) {
        super(name, nino, salary);
        this.budget = budget;
    }


    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public double payBonus(){
        return this.salary * 0.02;
    }
}
