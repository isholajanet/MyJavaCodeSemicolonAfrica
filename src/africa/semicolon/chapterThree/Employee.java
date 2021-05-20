package africa.semicolon.chapterThree;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;
    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public void setEmployeeFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmployeeFirstName() {
        return firstName;
    }

    public void setEmployeeLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeLastName() {
        return lastName;
    }

    public void setEmployeeSalary(double salary) {
        this.salary = salary;
    }

    public double getEmployeeSalary() {
        if(salary > 0.0) {
            return salary;
        }else{
            return 0.0;
        }
    }

    public void yearlySalary() {
        double yearlySalary = salary * 12;
        salary = yearlySalary;
    }

    public void BonusSalary() {
        double percentage = (10 * salary) / 100;
        double yearlyBonus = salary + percentage;
        salary = yearlyBonus;
    }
}
