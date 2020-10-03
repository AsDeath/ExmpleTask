// chapter 9 task 14
// chapter 9 task 14
// chapter 9 task 14
import java.util.ArrayList;
import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String firstname, lastname, socialSecurityNumber;
        double grossSales, commissionRate, baseSalary;
        int size = 2;
        ArrayList<BasePlusCommissionEmployee> employees = new ArrayList<>(size);

        for(int i = 1; i<=size; i++){
            System.out.printf("Enter data for Employee%d: \n", i);
            System.out.print("Enter First name: ");
            firstname = input.next();
            System.out.print("Enter Last name: ");
            lastname = input.next();
            System.out.print("Enter Social Security Number: ");
            socialSecurityNumber = input.next();
            System.out.print("Enter Gross Sales: ");
            grossSales = input.nextDouble();
            System.out.print("Enter Commission Rate: ");
            commissionRate = input.nextDouble();
            System.out.print("Enter Base Salary: ");
            baseSalary = input.nextDouble();
            employees.add(new BasePlusCommissionEmployee(firstname, lastname,socialSecurityNumber,grossSales,commissionRate,baseSalary));
            System.out.println();
        }

        printDataEmployees(employees);
    }

    public static void printDataEmployees(ArrayList<BasePlusCommissionEmployee> employees){
        System.out.println();
        int i = 1;
        for(BasePlusCommissionEmployee employee:employees){
            System.out.printf("Employee%d: ",i);
            System.out.print(employee.toString());
            System.out.println("Earnings: "+ employee.earnings()+"\n");
            i++;
        }
    }
}
