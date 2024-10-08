package March10;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1= "aba";
        String s2= "aab";

        if(s1.length()==s2.length())
        {
            System.out.println("Length of two Strings is same");
        }
        else {
            System.out.println("Length of two Strings is not same");
        }

        char[] ch1=  s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        Arrays.sort(ch1);
        System.out.println(ch1);
        Arrays.sort(ch2);
        System.out.println(ch2);
        if(Arrays.equals(ch1,ch2)){
            System.out.println("It is a anagram");
        }
        else{
            System.out.println("Not an anagram");
        }


    }
}
