import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a, b;
        a = input.nextInt();
        b = input.nextInt();
        System.out.printf("Sum: %d\n",a+b);
        System.out.printf("product: %d\n",a*b);
        System.out.printf("Difference: %d\n",a-b);
        System.out.printf("Division: %d\n",a/b);

    }
}
