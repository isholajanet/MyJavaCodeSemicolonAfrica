package africa.semicolon.chapterNine.Employee;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary cannot be less than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0.0){
            throw new IllegalArgumentException("base salary cannot be less than 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + "BasePlusCommissionEmployee{" +
                "baseSalary = " + baseSalary +
                "earnings = " + earnings() +
                '}';
    }
}
