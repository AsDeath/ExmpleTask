import java.util.Scanner;

public class Chapter5Task11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantityNumbers, min, nextNumber;
        System.out.print("Enter quantity number: ");
        quantityNumbers = input.nextInt();

        System.out.print("Enter number: ");
        min = input.nextInt();
        while(quantityNumbers>1){
            System.out.print("Enter next number: ");
            nextNumber = input.nextInt();
            if(nextNumber<min) min = nextNumber;
            quantityNumbers--;
        }
        System.out.printf("\nNumber %d is smallest",min);
    }
}
