import java.util.Scanner;

public class Chapter14Task9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string: ");
        String inputString = input.nextLine();

        String[] tokens = inputString.split(" ");

        for(int i = tokens.length-1; i>=0; i--){
            StringBuffer str = new StringBuffer(tokens[i]).reverse();
            System.out.println(str);
        }
    }
}
