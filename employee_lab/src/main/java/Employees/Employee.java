package Employees;

public abstract class Employee {
    protected String name;
    protected String nino;
    protected double salary;

    public Employee(String name, String nino, double salary) {
        this.name = name;
        this.nino = nino;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNino() {
        return nino;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNino(String nino) {
        this.nino = nino;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment){
        this.salary = this.salary + (this.salary * (increment/100));
    }
    public  double payBonus(){
        return this.salary * 0.01;
    }

}
