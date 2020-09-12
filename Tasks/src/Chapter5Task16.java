import java.util.Scanner;

public class Chapter5Task16 {
    public static void main(String[] args){
        int count=0, arrSize = 5;
        int[] arrNumber = new int[arrSize];
        Scanner input = new Scanner(System.in);
        while(count<5){
            System.out.printf("Enter number%d between 1 and 30: ",count+1);
            arrNumber[count] = input.nextInt();
            if(arrNumber[count]>0 && arrNumber[count]<=30){
                count++;
            }else System.out.println("Wrong data! Try again.");
        }
        System.out.println();

        for(int i = 0; i<arrSize; i++){
            for(int j = 0; j<arrNumber[i]; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
