import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a, b, sum, product, difference, division;
        a = input.nextInt();
        b = input.nextInt();
        sum = a + b;
        product = a*b;
        difference = a-b;
        division = a/b;
        System.out.printf("Sum: %d\n",sum);
        System.out.printf("product: %d\n",product);
        System.out.printf("Difference: %d\n",difference);
        System.out.printf("Division: %d\n",division);

    }
}
