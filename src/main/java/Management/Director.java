package Management;

import Management.Manager;

public class Director extends Manager {

    private double budget;

    public Director(String name, int NI_number, int salary, String deptName, double budget) {
        super(name, NI_number, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }

    public double payBonus() {
        return this.getSalary() * 0.02;
    }
}