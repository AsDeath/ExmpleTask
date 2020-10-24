import java.security.SecureRandom;

public class Chapter14Task5 {
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};
        int quantityCycles = 20;
        String[] newString = new String[quantityCycles];

        for(int i = 0; i<quantityCycles; i++){
            String s1 = article[random.nextInt(12)%5];
            String s2 = s1.substring(0,1).toUpperCase();
            newString[i] = s2 + s1.substring(1);

            newString[i] = newString[i] + " " + noun[random.nextInt(12)%5];
            newString[i] = newString[i] + " " + verb[random.nextInt(12)%5];
            newString[i] = newString[i] + " " + preposition[random.nextInt(12)%5] + ".";
        }

        for(int i = 0; i<quantityCycles; i++){
            System.out.println(newString[i]);
        }
    }
}
