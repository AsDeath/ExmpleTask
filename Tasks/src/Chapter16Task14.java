import java.util.*;

public class Chapter16Task14 {
    public static void main(String[] args){
        // create HashMap to store String keys and Integer values
        Map<Character, Integer> myMap = new HashMap<>();
        createMap(myMap); // create map based on user input
        displayMap(myMap); // display map content
    }
    private static void createMap(Map<Character, Integer> map)
    {
        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a string:"); // prompt for user input
        String input = scanner.nextLine();

        char[] str = input.toLowerCase().toCharArray();
        for (char c : str) {
            if (c == ' ') continue;
            if (map.containsKey(c)) {
                int count = map.get(c);
                map.put(c, count + 1);
            } else {
                map.put(c, 1);
            }
        }
    }
    private static void displayMap(Map<Character, Integer> map)
    {
        Set<Character> keys = map.keySet();
        SortedSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.println("\nMap contains: \nKey\t\tValue");
        for(char key:sortedKeys){
            System.out.printf("%-10c%10d\n", key, map.get(key));
        }
        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size() , map.isEmpty());
    }
}
