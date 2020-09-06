import java.util.Scanner;

public class Task17 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int size = 3, sum = 0, product = 1, average;
        int[] Arr = new int[size];
        System.out.println("Enter numbers: ");
        for(int i = 0; i<size; i++) {
            Arr[i] = input.nextInt();
            sum = sum + Arr[i];
            product = product * Arr[i];
        }
        average = sum/size;
        System.out.printf("Sum: %d\n",sum);
        System.out.printf("product: %d\n",product);
        System.out.printf("Average: %d\n",average);
        int equal = Arr[0];
        for(int i = 1; i<size; i++){
            if(Arr[i] == equal) equal = Arr[i];
        }
        if(equal == Arr[size-1]) System.out.println("These number are equal");
        else {
            for(int i = 1; i<size; i++){
                int x = Arr[i];
                int ind = i;
                while(ind>0 && x<Arr[ind-1]){
                    Arr[ind] = Arr[ind-1];
                    ind--;
                }
                Arr[ind] = x;
            }
            System.out.printf("Number %d is smallest\n",Arr[0]);
            System.out.printf("Number %d is largest\n", Arr[size-1]);
        }
    }
}
