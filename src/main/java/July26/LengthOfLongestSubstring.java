package July26;

import java.util.*;

public class LengthOfLongestSubstring {

    static void lengthOfLongestSubstring(String s){

        ArrayList<String> subArrayList = new ArrayList<>();

        for(int i = 0; i<=s.length();i++){
            for(int j = i+1; j<=s.length();j++){
                subArrayList.add(s.substring(i,j));
            }
        }
        System.out.println("List of SubArray" + subArrayList);
        ArrayList<String> subListWithOutDuplicate = new ArrayList<>();
        for(String str: subArrayList){
           if(LengthOfLongestSubstring.repeatedCharsCheck(str))
           {
               subListWithOutDuplicate.add(str);
           }
        }
        System.out.println("withoutDuplicate" + subListWithOutDuplicate);
       System.out.println(LengthOfLongestSubstring.lengthMax(subListWithOutDuplicate));

    }
    static boolean repeatedCharsCheck(String inputString) {
        char[] charStr = inputString.toCharArray();
        Set<Character> unique = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (char c : charStr) {
            if (unique.contains(c)) {
                duplicate.add(c);
            } else {
                unique.add(c);
            }
        }
        if (duplicate.size() >= 1) {
            return false;
        }
        else {
            return true;
        }
    }
    static int lengthMax(List<String> strings) {
        int maxLength = 0;

        for (String str : strings) {
            if (str.length() > maxLength) {
                maxLength = str.length();
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String inputString = new String("aaabcdefga");
        LengthOfLongestSubstring.lengthOfLongestSubstring(inputString);
    }
}