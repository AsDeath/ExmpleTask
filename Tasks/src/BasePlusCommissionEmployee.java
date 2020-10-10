public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;

    public BasePlusCommissionEmployee(int month, int day, int year, String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
        super(month, day, year, firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
        setBaseSalary(baseSalary);
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0)
            throw new IllegalArgumentException(
                    "Base salary must be >= 0.0");
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double earnings(int month){
        if(month == super.getMonth()){
            return earnings() + 100.0;
        } else return earnings();
    }
    @Override
    public double earnings(){
        return getBaseSalary() + super.earnings();
    }

    @Override
    public String toString() {
        return super.toString() + "BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                "}";
    }
}
