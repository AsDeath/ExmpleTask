import java.util.Scanner;

public class Chapter2Task25 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = input.nextInt();
        if(n%2==0) System.out.printf("Number %d is even",n);
        else System.out.printf("Number %d is odd",n);
    }
}
