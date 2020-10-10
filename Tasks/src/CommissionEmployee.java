public class CommissionEmployee extends Employee{
    private double grossSales; // gross weekly sales
    private double commissionRate; // commission percentage
    public CommissionEmployee(int month, int day, int year, String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
        super(month, day, year, firstName, lastName, socialSecurityNumber);
        setGrossSales(grossSales);
        setCommissionRate(commissionRate);
    }

    public void setGrossSales(double grossSales)
    {
        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    public void setCommissionRate(double commissionRate){
        if(commissionRate<=0.0 || commissionRate>=1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.p and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public double earnings(){
        return getGrossSales() * getCommissionRate();
    }

    @Override
    public String toString() {
        return super.toString() + "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commissionRate=" + commissionRate +
                "}\n";
    }
}