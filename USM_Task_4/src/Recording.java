import java.util.Scanner;

public class Recording {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       int miles, gallons, trips, count = 1;
       double calculate;
       boolean repeat;

       System.out.println("Enter quantity trips: ");
       trips = input.nextInt();

       while(trips>0) {
           repeat = false;
           System.out.printf("Enter miles for trip %d: \n",count);
           miles = input.nextInt();
           System.out.printf("Enter gallons for trip %d: \n",count);
           gallons = input.nextInt();
           if(gallons<=0 || miles<0) repeat = true;
           if(!repeat){
                calculate = (double)miles/gallons;
                System.out.printf("Miles on one gallon: %.2f\n",calculate);
                trips--;
                count++;
           }else{
               System.out.println("Incorrect data entered! Try again.");
           }
       }
   }
}
