// Chapter 8 task 6
// Chapter 8 task 6
// Chapter 8 task 6
public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    SavingsAccount(double savingsBalance){
        if(savingsBalance>0.0) this.savingsBalance = savingsBalance;
    }
    public void calculateMonthlyInterest(){
        double p = annualInterestRate/100;
        savingsBalance = savingsBalance + (savingsBalance*p)/12;
    }

    public static void modifyInterestRate(double rate){
        if(rate>0.0) annualInterestRate = rate;
    }

    public double getSavingsBalance(){
        return savingsBalance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
}
