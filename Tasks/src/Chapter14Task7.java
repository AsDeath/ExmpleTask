import java.util.Scanner;

public class Chapter14Task7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string (for example \"then\" :D ) ");
        String enteredString = input.nextLine();
        printLatinWord(enteredString);
    }
    public static void printLatinWord(String s){
        String text = "";
        for(int i = 0; i<s.length(); i++){
            if(Character.isAlphabetic(s.charAt(i))) {
                int j = i;
                while(!Character.isSpaceChar(s.charAt(i)) && i<s.length()-1){
                    i++;
                }
                if(i == s.length()-1) text = text + s.substring(j+1,i+1) + s.charAt(j) + "ay";
                else text = text + s.substring(j+1,i) + s.charAt(j) + "ay" + " ";
            }
        }
        String[] words = text.split(" ");
        for(String word:words){
            System.out.println(word);
        }
    }
}
