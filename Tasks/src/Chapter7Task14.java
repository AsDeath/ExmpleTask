import java.util.Scanner;

public class Chapter7Task14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int product1, product2, product3;

        product1 = product(10,11,12,13,14,15);
        product2 = product(-5,10,-25,40);
        product3 = product(-1478,385,0);

        System.out.printf("The product of 10, 11, 12, 13, 14 and 15 is: %d\n",product1);
        System.out.printf("The product of -5, 10, -25 and 40 is: %d\n",product2);
        System.out.printf("The product of -1478, 385 and 0 is: %d\n",product3);
    }

    public static int product(int... list){
        int prod = 1;
        for(int i = 0; i<list.length; i++){
            prod = prod * list[i];
        }
        return prod;
    }
}
