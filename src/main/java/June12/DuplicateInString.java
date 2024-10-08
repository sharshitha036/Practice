package June12;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateInString {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a String");
        String GivenString = scanner.next();
        duplicateOfString(GivenString);
    }
    public static void duplicateOfString(String str){
        char[] inputString = str.toCharArray();
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();
        for (int i = 0; i<= inputString.length-1;i++)
        {
           if(unique.contains(inputString[i])){
               duplicate.add(inputString[i]);
            }
           else {
               unique.add(inputString[i]);
           }
        }
        System.out.println("Duplicate characters are "+ duplicate);
        System.out.println("Unique characters are " + unique );
    }
}
