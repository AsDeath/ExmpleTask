import java.util.Scanner;

public class Chapter4Task18 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int quantityCustomers, count = 1;
        double beginningBalance, charges, credits, creditLimit;
        String accountNumber;

        System.out.println("Enter quantity customers: ");
        quantityCustomers = input.nextInt();

        Customer[] arrAccount = new Customer[quantityCustomers];
        while(quantityCustomers>0) {
            System.out.printf("Enter account number %d: ",count);
            accountNumber = input.next();
            System.out.printf("Enter beginning balance %d: ", count);
            beginningBalance = input.nextDouble();
            System.out.printf("Enter charges %d: ", count);
            charges = input.nextDouble();
            System.out.printf("Enter credits %d: ", count);
            credits = input.nextDouble();
            System.out.printf("Enter credit limit %d: ", count);
            creditLimit = input.nextDouble();
            arrAccount[count-1] = new Customer(accountNumber,beginningBalance,charges,credits,creditLimit);
            System.out.printf("\nNew balance %d: %.2f",count, arrAccount[count-1].getNewBalance());
            if(arrAccount[count-1].getNewBalance()>arrAccount[count-1].getCreditLimit()) System.out.println("\nCredit limit exceeded");
            count++;
            quantityCustomers--;
            System.out.println("\n");
        }

    }
}

class Customer{
    private String accountNumber;
    private double beginningBalance;
    private double charges;
    private double credits;
    private double creditLimit;
    private double newBalance;

    Customer(String accountNumber, double beginningBalance, double charges, double credits, double creditLimit){
        this.accountNumber = accountNumber;
        if(beginningBalance>=0) this.beginningBalance = beginningBalance;
        if(charges>=0) this.charges = charges;
        if(credits>=0) this.credits = credits;
        if(creditLimit>0) this.creditLimit = creditLimit;
        newBalance = this.beginningBalance + this.charges - this.credits;
    }

    public String getAccountNumber(){
        return accountNumber;
    }
    public double getBeginningBalance(){
        return beginningBalance;
    }
    public double getCharges(){
        return charges;
    }
    public double getCredits(){
        return credits;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public double getNewBalance(){
        return newBalance;
    }
}