import java.util.Scanner;

public class Task16 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a,b;
        System.out.println("Enter two numbers: ");
        a = input.nextInt();
        b = input.nextInt();
        if(a == b) System.out.println("These numbers are equal");
        else if(a > b) System.out.printf("Number %d is large",a);
        else System.out.printf("Number %d is large",b);
    }
}
