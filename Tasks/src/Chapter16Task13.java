
import java.util.*;

public class Chapter16Task13 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String enteredName;
        String[] firstNames = {"Amelia", "Olivia", "Jessica", "Emily", "Lily", "Ava", "Heather", "Sophie",
                "Mia", "Isabella", "Harry", "Oliver", "Jack", "Emily", "Lily", "Ava", "Heather", "Sophie",
                "Mia", "Isabella", "Charlie", "Thomas", "Jacob", "Alfie", "Riley", "William", "James", "Thomas",
                "Jacob", "Alfie", "Riley", "William"};
        Set<String> s_names = new HashSet<>(Arrays.asList(firstNames));
        printSet(s_names);

        System.out.println("Enter name: ");
        enteredName = input.next();
        searchName(s_names,enteredName);
    }
    public static void printSet(Set<String> s_names){
        for (String s : s_names)
            System.out.printf("%s ", s);
        System.out.println();
    }
    public static void searchName(Set<String> s_names, String enteredName){
        int count = 0;
        boolean check = false;
        for(String name:s_names){
            if(name.equalsIgnoreCase(enteredName)){
                System.out.println(enteredName+" is exist in Set and have index: "+count);
                check = true;
                break;
            }
            count++;
        }
        if(!check) System.out.println(enteredName + " does't exist in Set");

    }
}
