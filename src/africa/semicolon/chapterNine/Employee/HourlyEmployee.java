package africa.semicolon.chapterNine.Employee;

public class HourlyEmployee extends Employee{
    private double hoursWorked;
    private double wage;

    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hoursWorked, double wage) {
        super(firstName, lastName, socialSecurityNumber);
        if(hoursWorked < 0.0){
            throw new IllegalArgumentException("Hours worked cannot be less than 0");
        }
        if(wage < 0.0){
            throw new IllegalArgumentException("Wage cannot be less than 0");
        }
        this.hoursWorked = hoursWorked;
        this.wage = wage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        if(hoursWorked < 0 || hoursWorked > 168){
            throw new IllegalArgumentException("cannot be less than 0");
        }
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if(wage < 0){
            throw new IllegalArgumentException("cannot be less than 0");
        }
        this.wage = wage;
    }
    public double earnings(){
        return wage * hoursWorked;
    }
}
