package Feb24;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Anagram
 */
public class Question4 {

    public static void main(String[] args) {
        String s = "hars";
        String s1= "rash";

        int a = s.length();
        int b = s1.length();
        System.out.println(a==b);

        char[] c = s.toCharArray();
        char[] c1 = s1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(c1);

        System.out.println(Arrays.equals(c,c1));

    }


}
