import java.util.Scanner;

public class Chapter7Task12 {
    public static void main(String[] args){
        final int N = 5;
        int[] Arr = new int[N];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 numbers between 10 and 100: ");
        for(int i=0; i<N; ){
            System.out.printf("Enter number %d: ",i+1);
            Arr[i] = input.nextInt();
            if(Arr[i]>=10 && Arr[i]<=100) i++;
            else System.out.println("Wrong data. Try again!");
        }

        System.out.println("Output unique data: ");
        boolean check = false;
        for(int i=0; i<N; i++){
            for(int j = 0; j<N; j++){
                if(i==j) continue;
                if(Arr[i]==Arr[j]) {
                    check = true;
                    break;
                }
            }
            if(check==false) System.out.printf("%3d   ", Arr[i]);
            check=false;
        }
    }
}
