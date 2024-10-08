package July26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class IsAnagram {
    public static void main(String[] args) {
        String word1 = "note";
        String  word2 = "tone";
        isAnagram(word1,word2);

    }
    static void isAnagram(String a , String b){

        char[] wordChar1 = a.toCharArray();
        char[] wordChar2 = b.toCharArray();
        Arrays.sort(wordChar1);
        Arrays.sort(wordChar2);

        if(Arrays.equals(wordChar1,wordChar2)){
            System.out.println("Given words are Anagrams");
        }
        else {
            System.out.println("Not an anagram");
        }





    }
}
