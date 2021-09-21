package africa.semicolon.chapterNine.Employee;

public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if(grossSales < 0.0){
            throw new IllegalArgumentException("Gross sales cannot be less than 0");
        }
        if(commissionRate < 0.0){
            throw new IllegalArgumentException("Commission rate cannot be less than 0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;

    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double earnings(){
        return commissionRate * grossSales;
    }

    @Override
    public String toString() {
        return super.toString() + "CommissionEmployee{" +
                "grossSales = " + grossSales +
                ", commissionRate = " + commissionRate +
                ", earnings= " + earnings() +
                '}';
    }
}
