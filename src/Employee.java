public abstract class Employee {
    // TODO fix class declaration and declare variables here
    private String employeeId;
    private String name;

    public Employee(String employeeId, String name) {
        this.employeeId = employeeId;
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageMonthlySalary() {
        return calculatePay();
    }

    @Override
    public String toString() {
        return String.format("name: %s employeeId: %s pay: %.2f",
                name, employeeId, getAverageMonthlySalary());
    }

    public abstract double calculatePay();
}