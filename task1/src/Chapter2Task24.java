import java.util.Scanner;

public class Chapter2Task24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = 5;
        int[] Numbers = new int[n];
        System.out.printf("Enter %d numbers:\n",n);
        for(int i = 0; i < n; i++){
            Numbers[i] = input.nextInt();
        }
        int max = Numbers[0], min = Numbers[n-1];
        for(int i = 1; i < 5; i++){
            if(Numbers[i]>max) max = Numbers[i];
            if(Numbers[i-1]<min) min = Numbers[i-1];
        }

        System.out.printf("Max: %d\n",max);
        System.out.printf("Min: %d\n",min);
    }
}
