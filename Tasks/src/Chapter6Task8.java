import java.security.SecureRandom;
import java.util.Scanner;

public class Chapter6Task8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        SecureRandom random = new SecureRandom();
        int numberOfSeats = 20, sizeArr = random.nextInt(numberOfSeats), count = 0, sumHours = 0;
        double sumCharges = 0;
        int[] arrTimeForParkedCars = new int[sizeArr];
        double[] arrChargeCars = new double[sizeArr];

        while(count<sizeArr){
            System.out.printf("Enter the hours parked for car%d(maximum time - 24 hours): ",count+1);
            arrTimeForParkedCars[count] = input.nextInt();
            sumHours+=arrTimeForParkedCars[count];
            if (arrTimeForParkedCars[count]>24) arrTimeForParkedCars[count] = 24;
            if (arrTimeForParkedCars[count]<0) arrTimeForParkedCars[count] = 0;
            arrChargeCars[count] = calculateCharge(arrTimeForParkedCars[count]);
            sumCharges+=arrChargeCars[count];
            System.out.printf("Car%d:\nHours: %d     Charge: %.2f\n\n",count+1,arrTimeForParkedCars[count],arrChargeCars[count]);
            count++;
        }
        System.out.printf("Total:\nSum hours: %d      Sum charges: %.2f",sumHours,sumCharges);
    }
    
    public static double calculateCharge(int hours){
        double finalCharge = 0;
        if(hours>19) finalCharge = 10;
        else if(hours>3){
            finalCharge = 2 + (hours-3)*0.5;
        } else finalCharge = 2;
        return finalCharge;
    }
}
