import java.util.*;

public class Test {
    public static void main(String[] args){
        Scanner input  = new Scanner(System.in);
        String firstname, lastname, socialSecurityNumber;
        double grossSales, commissionRate, baseSalary;
        int month, day, year;
        int size = 1;
        ArrayList<BasePlusCommissionEmployee> employees = new ArrayList<>(size);
        for(int i = 1; i<=size; i++){
            System.out.printf("Enter data for Employee%d: \n", i);
            System.out.print("Enter First name: ");
            firstname = input.next();
            System.out.print("Enter Last name: ");
            lastname = input.next();
            System.out.print("Enter Month your birth day(1-12): ");
            month = input.nextInt();
            System.out.print("Enter Day your birth day(1-31): ");
            day = input.nextInt();
            System.out.print("Enter Year your birth day(yyyy): ");
            year = input.nextInt();
            System.out.print("Enter Social Security Number: ");
            socialSecurityNumber = input.next();
            System.out.print("Enter Gross Sales: ");
            grossSales = input.nextDouble();
            System.out.print("Enter Commission Rate: ");
            commissionRate = input.nextDouble();
            System.out.print("Enter Base Salary: ");
            baseSalary = input.nextDouble();
            employees.add(new BasePlusCommissionEmployee(month,day,year,firstname, lastname,socialSecurityNumber,grossSales,commissionRate,baseSalary));
            System.out.println();
        }

        printDataEmployees(employees);
    }

    public static void printDataEmployees(ArrayList<BasePlusCommissionEmployee> employees){
        Calendar calendar = Calendar.getInstance();
        int i = 1;
        for(BasePlusCommissionEmployee employee:employees){
            System.out.printf("Employee%d: ",i);
            System.out.println(employee.toString());
            System.out.println("Earnings1: "+ employee.earnings()+"\nEarnings2(birthDay): "+employee.earnings(calendar.get(Calendar.MONTH)+1)+"\n\n");
            i++;
        }
    }
}
