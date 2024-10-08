package july17;

import java.util.HashSet;
import java.util.Set;

public class Question2 {
    public static void main(String[] args) {
        Integer num = 11132243;
        String strNum= String.valueOf(num);
        char[] charStr = strNum.toCharArray();
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : charStr){
            if(duplicate.contains(c)){
                continue;
            }
            else if(!unique.contains(c)){
                unique.add(c);
            }
            else{
                unique.remove(c);
                duplicate.add(c);
            }
        }
        System.out.println("Unique"+unique);
        System.out.println("Duplicate"+duplicate);

    }
}
