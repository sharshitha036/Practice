package Feb24;

import java.util.HashSet;
import java.util.Set;

/**
 * String ---> Find out unique and duplicate values
 */
public class Question {

    public static void main(String[] args) {
        String s = "Hello World";
        char[] ch = s.toCharArray();
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : ch){
            if (unique.contains(c)){
                duplicate.add(c);
            }
            else{
                unique.add(c);
            }
            System.out.println(duplicate);
            System.out.println(unique);
        }
    }
}
