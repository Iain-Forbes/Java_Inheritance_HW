package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String name, int NI_number, int Salary, String deptName) {
        super(name, NI_number, Salary);
        this.deptName = deptName;

    }

    public String getDeptName() {
        return deptName;
    }
}
