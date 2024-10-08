package Feb24;

import java.util.HashMap;
import java.util.Map;

/**
 * String ----> find out the count of the  letters
 */
public class Question2 {
    public static void main(String[] args) {


        String inputString = "Harshitha";
        char[] inputArray = inputString.toCharArray();

        Map<Character, Integer> characterCounts = new HashMap<>();

        for (char c : inputArray){

           if(characterCounts.containsKey(c)){
               int x = characterCounts.get(c);
               x++;
               characterCounts.put(c,x);
           }
           else{
               characterCounts.put(c,1);
           }
        }
        System.out.println(characterCounts);

    }

}
