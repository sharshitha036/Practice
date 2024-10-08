package Practiceques;

import java.util.HashSet;
import java.util.Set;
public class practice {

    public static void main(String[] args) {


        String s = " Hello World";
        char[] ch = s.toCharArray();
        Set<Character> unique = new HashSet<Character>();
        Set<Character> duplicate = new HashSet<Character>();

        for (char c : ch) {
            if (unique.contains(c)) {
                duplicate.add(c);
            } else {
                unique.add(c);
            }
        }
        System.out.println(duplicate);
        System.out.println(unique);
    }
}
