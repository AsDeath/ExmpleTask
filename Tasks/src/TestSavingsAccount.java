// Chapter 8 task 6
// Chapter 8 task 6
// Chapter 8 task 6
public class TestSavingsAccount {
    public static void main(String[] args){

        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);
        SavingsAccount.modifyInterestRate(4);
        System.out.println("Calculate the monthly interest with Interest Rate 4% for each of 12 months");
        for(int i = 0; i<12; i++){
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }
        System.out.printf("New saving balance with Interest Rate 4 for saver1: %.2f\n", saver1.getSavingsBalance());
        System.out.printf("New saving balance with Interest Rate 4 for saver2: %.2f\n\n", saver2.getSavingsBalance());

        SavingsAccount.modifyInterestRate(5);
        System.out.println("Calculate the monthly interest with Interest Rate 5% for next month");
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        System.out.printf("New saving balance with Interest Rate 5 for saver1: %.2f\n", saver1.getSavingsBalance());
        System.out.printf("New saving balance with Interest Rate 5 for saver2: %.2f\n\n", saver2.getSavingsBalance());
    }
}
