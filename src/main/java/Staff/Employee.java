package Staff;

public abstract class Employee {

    private String name;
    private int NI_number;
    private double salary;

    public Employee(String name, int NI_number, int salary){
        this.name = name;
        this.NI_number = NI_number;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNI_number() {
        return NI_number;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount) {
        if (amount >= 0.01) {
            this.salary += amount;
        }
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}


