package july17;

import java.util.HashSet;
import java.util.Set;

public class Question1 {
    public static void main(String[] args) {
        Integer num = 132243255;
        String strNum= String.valueOf(num);
        char[] charStr = strNum.toCharArray();
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : charStr){
            if(unique.contains(c)){
                duplicate.add(c);
            }
            else {
                unique.add(c);
            }
        }
        System.out.println("Unique"+unique);
        System.out.println("Duplicate"+duplicate);

    }
}
