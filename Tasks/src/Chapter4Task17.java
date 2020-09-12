import java.util.Scanner;

public class Chapter4Task17 {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int miles, gallons, trips, count = 1;
       double calculate;

       System.out.println("Enter quantity trips: ");
       trips = input.nextInt();

       while(trips>0) {
           System.out.printf("Enter miles for trip %d: \n",count);
           miles = input.nextInt();
           if(miles>0) {
               System.out.printf("Enter gallons for trip %d: \n", count);
               gallons = input.nextInt();
               if(gallons>=0){
                   calculate = (double)miles/gallons;
                   System.out.printf("Miles per gallon: %.2f\n",calculate);
                   trips--;
                   count++;
               } else System.out.println("Incorrect data entered! Try again.");
           } else System.out.println("Incorrect data entered! Try again.");
       }

   }
}
