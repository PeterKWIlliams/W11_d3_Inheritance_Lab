package Employees;

public abstract class Employee {
    private String name;
    private String nino;
    private double salary;

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

    public abstract void raiseSalary(double increment);
    public abstract double payBonus();

}
